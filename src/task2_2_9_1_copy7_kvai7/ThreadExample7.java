package task2_2_9_1_copy7_kvai7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// источник: https://youtu.be/ns1imummWPw  Урок по Java 75: Многопоточность 10: Wait and Notify пример
// отматываем назад от мин 10 38
public class ThreadExample7 {
    static final List<String> strings = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException {
        System.out.println("""
                Задание:\s
                Модуль 2. Тема 2. Урок 9. Многопоточность.
                    Задание:
                      1. Создать класс расширяющий Thread
                      1.	Создать класс NewThread расширяющий Thread.
                      2.	Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
                      3.	Создать экземпляр класса и запустить новый поток.
                      2. Создать класс реализующий Runnable
                      1.	Создать класс, реализующий интерфейс Runnable.
                      2.	Переопределить run() метод. Создать цикл for. В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка.
                      3.	Используем статический метод Thread.sleep(), чтобы сделать паузу.
                      4.	Создать три потока, выполняющих задачу распечатки значений.

                Решение:\s""");

//        new ThreadExample7.MyThread4().start();
//        new ThreadExample7.MyThread7().start();
        Thread t4 = new Thread(new MyThread4());
        t4.start();

        Thread tPause4 = new Thread(new Pause());
        tPause4.start();

        Thread t5 = new Thread(new MyThread5());
        t5.start();

        Thread tPause5 = new Thread(new Pause());
        tPause5.start();

        Thread t6 = new Thread(new MyThread6());
        t6.start();

        Thread tPause6 = new Thread(new Pause());
        tPause6.start();

//        Thread t7 = new Thread(new MyThread7());
//        t7.start();
    }

    static class MyThread4 implements Runnable {
        int count = 0;

        @Override
        public void run() {
            while (count == 0) {

                synchronized (strings) {
                    // 4. 1.	Создать класс, реализующий интерфейс Runnable.
                    System.out.println("4. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
                            "1. Создать класс, реализующий интерфейс Runnable." + "\nНа примере создания счётчика " +
                            "от 1-го до 5-ти:");

                    for (int i = 0; i < 5; i++) {
                        count++;
                        try {
                            Thread.sleep(800);
                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
                            e.printStackTrace();
                        }
                        System.out.println("Runnable count " + count);
                    }
                    System.out.println();
                    count++;
                }
            }

            synchronized (strings) {
                strings.notify();
            }
        }
    }


    static class MyThread5 implements Runnable {

        @Override
        public void run() {
            synchronized (strings) {

                // 5. 2.	Переопределить run() метод. Создать цикл for. В цикле распечатываем значения
                // от 0 до 100 делящиеся на 10 без остатка.
                System.out.println("5. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
                        "2. Переопределить run() метод. Создать цикл for. В цикле распечатываем значения " +
                        "от 0 до 100 делящиеся на 10 без остатка:");

                for (int i = 0; i <= 100; i++) {
                    try {
                        Thread.sleep(60);
                    } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
                        e.printStackTrace();
                    }
                    if (i % 10 == 0) {
                        System.out.println(i);
                    }
                }
                System.out.println();
            }

            synchronized (strings) {
                strings.notify();
            }
        }
    }


    static class MyThread6 implements Runnable {
        int count = 0;

        @Override
        public void run() {
            while (count == 0) {

                synchronized (strings) {
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // 6. 3.	Используем статический метод Thread.sleep(), чтобы сделать паузу.
                    System.out.println("6. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
                            "3. Используем статический метод Thread.sleep(), чтобы сделать паузу." +
                            "\nДелаем паузу 800 миллисекунд между выводом на печать значений счетчика 1 и 2:");

                    for (int i = 0; i < 2; i++) {
                        count++;
                        try {
                            Thread.sleep(800);
                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
                            e.printStackTrace();
                        }
                        System.out.println("Значение счетчика: " + count);
                    }
                    count++;
                    System.out.println();
                }
            }

            synchronized (strings) {
                strings.notify();
            }
        }
    }


    //    static class MyThread7 extends Thread {
    static class MyThread7 implements Runnable {
        @Override
        public void run() {
            synchronized (strings) {

                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    strings.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 7. 4.	Создать три потока, выполняющих задачу распечатки значений.
                System.out.println("7. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
                        "4. Создать три потока, выполняющих задачу распечатки значений." + "\nНа примере " +
                        "вывода уведомлений о старте и финише трёх потоков:");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread" + (i + 1) + " started");
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread" + (i + 1) + " finished");
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
            System.exit(0);
        }
    }


    static class Pause implements Runnable {

        @Override
        public void run() {
                synchronized (strings) {
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

//                    for (int i = 0; i < 2; i++) {
//                        count++;
                        try {
                            Thread.sleep(800);
                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
                            e.printStackTrace();
                        }
//                        System.out.println("Значение счетчика: " + count);
//                    }
//                    count++;
//                    System.out.println();
                    strings.notify();
                }
            }

//            synchronized (strings) {
//                strings.notify();
//            }
        }
    }


