package task2_2_9_1_copy11_javarus_OkRabotaet;


// источник: https://stackoverflow-com.translate.goog/questions/15997483/how-to-ensure-java-threads-run-in-a-particular-order?_x_tr_sl=en&_x_tr_tl=ru&_x_tr_hl=ru
public class Example11 {
    public static void main(String[] args) {

        Thread a = new Thread(new A());
        Thread b = new Thread(new B());
        Thread c = new Thread(new C());
        Thread d = new Thread(new D());

        a.start();
        try {
            a.join();
            b.start();
            b.join();
            c.start();
            c.join();
            d.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class A implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ClassA : A");
        System.out.println("1. Создать класс, реализующий интерфейс Runnable." +
                "\nРеализовано на примере создания счётчика от 1-го до 5-ти:");

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runnable count " + (i + 1));
        }
        System.out.println();
    }
}

class B implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ClassB : B");
        System.out.println("2. Переопределить run() метод. Создать цикл for. В цикле распечатать значения " +
                "\nот 0 до 100 делящиеся на 10 без остатка:");

        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}

class C implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ClassC : C");
        System.out.println("""
                3. Использовать статический метод Thread.sleep(), чтобы сделать паузу.
                Реализовано путём создания паузы 1200 миллисекунд между выводом на печать\s
                значений счетчика '1' и '2':""");

        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Counter value: " + (i + 1));
        }
        System.out.println();
    }
}

class D implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ClassD : D");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("4. Создать три потока, выполняющих задачу распечатки значений." +
                "\nРеализовано на примере вывода уведомлений о старте и финише трёх потоков:");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Thread" + (i + 1) + " started");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Thread" + (i + 1) + " finished");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.exit(0);
    }
}




//// Оригинал
//public class Example11 {
//    static final List<String> strings = Collections.synchronizedList(new ArrayList<>());
//
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//
//        ExecutorService service4 = Executors.newFixedThreadPool(1);
//        Thread t4 = new Thread(new /*Example11.*/MyThread4());
//        t4.start();
//        service4.shutdown();
//
//        ExecutorService service5 = Executors.newFixedThreadPool(1);
//        Thread t5 = new Thread(new /*Example11.*/MyThread5());
//        t5.start();
//        service5.shutdown();
//
//        ExecutorService service6 = Executors.newFixedThreadPool(1);
//        Thread t6 = new Thread(new /*Example11.*/MyThread6());
//        t6.start();
//        service6.shutdown();
//
//        ExecutorService service7 = Executors.newFixedThreadPool(1);
//        Thread t7 = new Thread(new /*Example11.*/MyThread7());
//        t7.start();
//        service7.shutdown();
//
//    }
//
//    static class MyThread4 implements Runnable {
//        @Override
//        public void run() {
//            synchronized (strings) {
//                // 4. 1.	Создать класс, реализующий интерфейс Runnable.
//                System.out.println("4. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
//                        "1. Создать класс, реализующий интерфейс Runnable." + "\nНа примере создания счётчика " +
//                        "от 1-го до 5-ти:");
//
//                for (int i = 0; i < 5; i++) {
//                    try {
//                        Thread.sleep(600);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("Runnable count " + (i + 1));
//                }
//                System.out.println();
//            }
//        }
//    }
//
//    static class MyThread5 implements Runnable {
//        @Override
//        public void run() {
//            synchronized (strings) {
//                // 5. 2.	Переопределить run() метод. Создать цикл for. В цикле распечатываем значения
//                // от 0 до 100 делящиеся на 10 без остатка.
//                System.out.println("5. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
//                        "2. Переопределить run() метод. Создать цикл for. В цикле распечатываем значения " +
//                        "от 0 до 100 делящиеся на 10 без остатка:");
//
//                for (int i = 0; i <= 100; i++) {
//                    try {
//                        Thread.sleep(30);
//                    } catch (InterruptedException e) {
////                            throw new RuntimeException(e);
//                        e.printStackTrace();
//                    }
//                    if (i % 10 == 0) {
//                        System.out.println(i);
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }
//
//
//    static class MyThread6 implements Runnable {
//
////        @SuppressWarnings("BusyWait")
//        @Override
//        public void run() {
//            synchronized (strings) {
////                try {
////                    strings.wait();
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
//
//                // 6. 3.	Используем статический метод Thread.sleep(), чтобы сделать паузу.
//                System.out.println("6. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
//                        "3. Используем статический метод Thread.sleep(), чтобы сделать паузу." +
//                        "\nДелаем паузу 800 миллисекунд между выводом на печать значений счетчика 1 и 2:");
//
//                for (int i = 0; i < 2; i++) {
//                    try {
//                        Thread.sleep(800);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("Значение счетчика: " + /*count*/ (i + 1));
//                }
//                System.out.println();
////                strings.notify();
//            }
//        }
//    }
//
//
//    //    static class MyThread7 extends Thread {
//    static class MyThread7 implements Runnable {
//        @Override
//        public void run() {
//            synchronized (strings) {
//
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
////                try {
////                    strings.wait();
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
//
//                // 7. 4.	Создать три потока, выполняющих задачу распечатки значений.
//                System.out.println("7. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
//                        "4. Создать три потока, выполняющих задачу распечатки значений." + "\nНа примере " +
//                        "вывода уведомлений о старте и финише трёх потоков:");
//                try {
//                    Thread.sleep(400);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                for (int i = 0; i < 3; i++) {
//                    System.out.println("Thread" + (i + 1) + " started");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//                for (int i = 0; i < 3; i++) {
//                    System.out.println("Thread" + (i + 1) + " finished");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }
//            System.exit(0);
//        }
//    }
//
//}
