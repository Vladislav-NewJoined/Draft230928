package task2_2_2_1;

import java.util.Scanner;

public class Task2_2_2_1_copy3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("""
                Задание:\s
                Модуль 2. Тема 2. Урок 2. Многопоточность Прерывание.
                    Задание 1. Напишите программу, которая сможет в одном потоке читать данные из консоли, 
                    а в другом потоке будет их выводить.

                Решение:\s""");

        Thread t = new Thread(new MyThread3());
        t.start();

        MyThreadInput3 t2 = new MyThreadInput3();
        t2.start();
        Thread.sleep(1500);
        t2.stopCounter();

    }
}

class MyThread3 implements Runnable {

    int count = 0;

    @Override
    public void run() {
        System.out.println("РЕАЛИЗУЕМ СЕКУНДОМЕР В ПОТОКОВОМ МЕТОДЕ run: " );
        while (!Thread.currentThread().interrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println(count + " сек.");
        }
    }
}

class MyThreadInput3 extends Thread {

    boolean isAlive = true;

    void stopCounter () {
        isAlive = false;
    }

    @Override
    public void run() {
        System.out.println("РЕАЛИЗУЕМ ПРЕРЫВАНИЕ ПОТОКА: " );
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите текст: Stop");
        String stopLine = scanner.nextLine();
    }

}

