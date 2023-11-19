package task2_2_9_1_copy6_Example_kvai2_nextIterate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
// источник: https://youtu.be/ns1imummWPw  Урок по Java 75: Многопоточность 10: Wait and Notify пример
// отматываем назад от мин 10 38
public class ThreadExample_NextIterate {
    static List<String> strings = Collections.synchronizedList(new ArrayList<>());
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

        new MyThread4().start();
        new MyThread7().start();
//        new ThreadExample_NextIterate.MyThread7().start();
    }
    static class MyThread4 extends Thread {
        int count = 0;

        @Override
        public void run() {
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
                        throw new RuntimeException(e);
                    }
                    System.out.println("Runnable count " + count);
                }
                System.out.println();
            }
            Scanner scanner = new Scanner(System.in);
            while (true) {
                synchronized (strings) {
                    strings.add(scanner.nextLine());
                    // 4. 1.	Создать класс, реализующий интерфейс Runnable.
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

                    strings.notify();
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class MyThread7 extends Thread {
        @Override
        public void run() {
            while (strings.isEmpty()) {
                synchronized (strings) {
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    System.out.println(strings.remove(0));
                    // 7. 4.	Создать три потока, выполняющих задачу распечатки значений.
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
                        try {
                            Thread.sleep(800);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Thread" + (i+1) + " finished");
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
    }
}

