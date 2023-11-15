package task2_2_9_1;

import static java.lang.Thread.sleep;

// Task2_2_1 _22 06 - несколько потоков выводят что-то на печать
// Task2_2_1 _ - в этом же ролике переопределение run
// Task2_2_2 _09 29 - interface Runnable
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

    }
}


class MyThread4 implements Runnable {

    int count = 0;

    @Override
    public void run() {
        System.out.println("4. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
                "1. Создать класс, реализующий интерфейс Runnable." + "\nНа примере создания счётчика " +
                "от 1-го до 5-ти:");

//        while (!Thread.currentThread().interrupted()) {
//            count++;
//        }
//        System.out.println(count);

        for (int i = 0; i < 5; i++) {
            count++;
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runnable count " + count);
        }
        System.out.println();
    }
}