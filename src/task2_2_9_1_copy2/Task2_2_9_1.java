package task2_2_9_1_copy2;

// Task2_2_1 _21 59 (21 22 - 21 42) - несколько потоков выводят что-то на печать
// Здесь: Урок 5. Разбор домашнего задания. Многопоточность. Synchronised: 08 09 - wait
// Task2_2_1 _ - в этом же ролике переопределение run
// Task2_2_2 _09 29 - interface Runnable
// Здесь про Методы wait и notify. Блокирующая очередь и Worker Thread: https://youtu.be/CA4oUmywL28
public class Task2_2_9_1 {
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


        Thread t4 = new Thread(new MyThread4());
        t4.start();
//        sleep(200);
//        t4.interrupt();

        Thread t7 = new Thread(new MyThread7());
        t7.start();


        /// 7. 4.	Создать три потока, выполняющих задачу распечатки значений.
//        System.out.println("7. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
//                "4. Создать три потока, выполняющих задачу распечатки значений." + "\nНа примере " +
//                "вывода уведомлений о старте и финише трёх потоков.");
//        System.out.println("Main thread started...");
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Thread" + (i+1) + " started");
//            new MyThread7("Thread" + (i+1)).start();
//        }
//        System.out.println("Main thread finished...");

    }
}


class MyThread4 implements Runnable {

    int count = 0;

    @Override
    public void run() {

        System.out.println("4. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
                "1. Создать класс, реализующий интерфейс Runnable." + "\nНа примере создания счётчика " +
                "от 1-го до 5-ти:");

        for (int i = 0; i < 5; i++) {
            count++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runnable count " + count);
        }
        System.out.println();
    }
}


//class MyThread7 extends Thread {
//    public MyThread7(String name) {
//        super(name);
//    }

class MyThread7 implements Runnable {

    @Override
    public void run() {
        /// 7. 4.	Создать три потока, выполняющих задачу распечатки значений.
        System.out.println("7. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
                "4. Создать три потока, выполняющих задачу распечатки значений." + "\nНа примере " +
                "вывода уведомлений о старте и финише трёх потоков.");
//        super.run();
//        System.out.println("Thread " + i + " started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
//        System.out.println(getName() + " finished");

        for (int i = 0; i < 3; i++) {
            System.out.println("Thread" + (i+1) + " started");
//            new MyThread7("Thread" + (i+1)).start();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Thread" + (i+1) + " finished");
//            new MyThread7("Thread" + (i+1)).start();
        }

    }
}
