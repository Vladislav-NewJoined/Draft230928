// видеоурок прервал на мин
package task2_2_1_0;

import java.util.ArrayList;

public class Task2_2_1_0_copy3_Whole_Video_Sdelat_Hitree {

//    Урок 1. Многопоточность, Thread
//    Цель задания: Формирование навыков работы с потоками данных в JAVA
//    Задание:
//    1.Создать класс NewThread, расширяющий Thread.
//    2.Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
//    3.Создать экземпляр класса и запустить новый поток
    public static void main(String[] args) throws InterruptedException {
        //  Другой метод создания потока мин 27 55
        System.out.println("Main thread started...");
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread t3 = new Thread(() -> {
                System.out.println("qwerty");
            },"Thread" + i);
            t3.start();
            threads.add(t3);
            Thread.sleep(300);
        }
        for (Thread t3 : threads) {
            t3.join();
        }
        System.out.println("Main thread finished...");


    }
}

//class MyThreadLogic2 implements Runnable {
//
//    @Override
//    public void run() {
//        //
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
