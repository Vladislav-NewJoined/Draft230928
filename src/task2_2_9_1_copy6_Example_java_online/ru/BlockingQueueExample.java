package task2_2_9_1_copy6_Example_java_online.ru;

public class BlockingQueueExample {
    MyThread4 t4 = new MyThread4();
    MyThread7 t7 = new MyThread7();

    public BlockingQueueExample()
    {
        (new Thread(t4)).start();
        (new Thread(t7)).start();
        (new Thread(new MyThreadEnd())).start();
    }

    static class MyThreadEnd implements Runnable
    {
        public void run() {
        }
    }

static class MyThread4 implements Runnable {

    int count = 0;

    @Override
    public void run() {

        System.out.println("4. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
                "1. Создать класс, реализующий интерфейс Runnable." + "\nНа примере создания счётчика " +
                "от 1-го до 5-ти:");

        for (int i = 0; i < 5; i++) {
            count++;
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runnable count " + count);
        }
        System.out.println();
    }
}


static class MyThread7 implements Runnable {

    @Override
    public void run() {
        /// 7. 4.	Создать три потока, выполняющих задачу распечатки значений.
        System.out.println("7. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
                "4. Создать три потока, выполняющих задачу распечатки значений." + "\nНа примере " +
                "вывода уведомлений о старте и финише трёх потоков.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Thread" + (i+1) + " started");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Thread" + (i+1) + " finished");
        }
    }
}


    public static void main(String[] args) throws InterruptedException {
        new BlockingQueueExample();
    }
}








// Оригинал
//package task2_2_9_1_copy6_Example_java_online.ru;
//
//        import java.util.concurrent.*;
//
//public class BlockingQueueExample {
//    private BlockingQueue<String> drop;
//
//    private final String  DONE = "done";
//
//    private final String[]  messages = {"Мама пошла готовить обед",
//            "Мама позвала к столу",
//            "Дети кушают молочную кашу",
//            "А что ест папа?"};
//    public BlockingQueueExample()
//    {
//        drop = new ArrayBlockingQueue<String>(1, true);
//        (new Thread(new Producer())).start();
//        (new Thread(new Consumer())).start();
//    }
//
//    class Producer implements Runnable
//    {
//        public void run() {
//            try {
//                int cnt = 0;
//                for (int i = 0; i < messages.length; i++) {
//                    drop.put(messages[i]);
//                    if (++cnt < 3)
//                        Thread.sleep(2000);
//                }
//                drop.put(DONE);
//            } catch (InterruptedException e) {
//                System.err.println("Interrupted! " + e.getMessage());
//            }
//        }
//    }
//
//    class Consumer implements Runnable
//    {
//        public void run() {
//            try {
//                String msg = null;
//                while (!((msg = drop.take()).equals(DONE)))
//                    System.out.println(msg);
//            } catch (InterruptedException e) {
//                System.err.println("Interrupted! " + e.getMessage());
//            }
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        new BlockingQueueExample();
//    }
//}
