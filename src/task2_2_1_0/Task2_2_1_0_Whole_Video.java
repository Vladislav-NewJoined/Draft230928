// видеоурок прервался на мин 22 40
package task2_2_1_0;

public class Task2_2_1_0_Whole_Video {
//    Урок 1. Многопоточность, ThreadЦель
//    задания: Формирование навыков работы с потоками данных в JAVA
//    Задание:
//    1.Создать класс NewThread, расширяющий Thread.
//    2.Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
//    3.Создать экземпляр класса и запустить новый поток
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        Thread t = Thread.currentThread();
//        System.out.println(t.getName());

        Thread t2 = new MyThread("MyThread2");
        t2.start();
        System.out.println(t2.getPriority());
//        t2.run();
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // видеоурок на мин 18 28 Здесь мы напишем небольшую программу
        for (int i = 0; i < 5; i++) {
        System.out.println("Thread " + i + " started");
            new MyThread("MyThread" + i).start();
        }
        System.out.println("Main thread finished...");
    }
}

class MyThread extends Thread {

    public MyThread(String name) {
//        super(name);
        setName(name);
    }

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " finished");
//        System.out.println(getName());
    }
}
