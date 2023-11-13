package task2_2_2_1;

import java.util.Scanner;

// Из разбора домашнего задания
public class Task2_2_2_1_copy4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("""
                Задание:\s
                Модуль 2. Тема 2. Урок 2. Многопоточность Прерывание.
                    Задание 1. Напишите программу, которая сможет в одном потоке читать данные из консоли,
                    а в другом потоке будет их выводить.

                Решение:\s""");

//        Thread t = new Thread(new MyThread4());
//        t.start();

        TimerState state = new TimerState();
        new TimerThread(state).start();
        new inputThread(state).start();

    }
}

//class MyThread4 implements Runnable {
//
//    int count = 0;
//
//    @Override
//    public void run() {
//        System.out.println("РЕАЛИЗУЕМ СЕКУНДОМЕР В ПОТОКОВОМ МЕТОДЕ run: ");
////        while (!Thread.currentThread().interrupted()) {
//        while (!Thread.interrupted()) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            count++;
//            System.out.println(count + " сек.");
//        }
//    }
//}


class TimerState {
    int counter = 0;
    boolean isRunning = true;

    void increment() {
        System.out.println(counter++);
    }

    void stopTime() {
        isRunning = false;
    }
}


class TimerThread extends Thread {
    final TimerState state;

    TimerThread(TimerState state) {
        this.state = state;
    }


    @Override
    public void run() {
        System.out.println("РЕАЛИЗУЕМ СЕКУНДОМЕР В ПОТОКОВОМ МЕТОДЕ run: ");
        super.run();
        try {
            while (state.isRunning) {
                state.increment();
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class inputThread extends Thread {
    final TimerState state;

    inputThread(TimerState state) {
        this.state = state;
    }

    @Override
    public void run() {
        System.out.println("РЕАЛИЗУЕМ ПРЕРЫВАНИЕ ПОТОКА: ");
        super.run();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s != null) {
            state.stopTime();
        }
    }
}

