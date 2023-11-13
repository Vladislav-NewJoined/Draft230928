package task2_2_2_1;

public class Task2_2_2_1_copy3_Example {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("""
                Задание:\s
                Модуль 2. Тема 2. Урок 2. Многопоточность Прерывание.
                    Задание 1. Напишите программу, которая сможет в одном потоке читать данные из консоли, 
                    а в другом потоке будет их выводить.

                Решение:\s""");

        Thread t = new Thread(new MyThread());
        t.start();
        Thread.sleep(700);
        t.interrupt();

//        t.stopCounter();
    }
}

class MyThread implements Runnable {

    int count = 0;

    @Override
    public void run() {
        while (!Thread.currentThread().interrupted()) {
//            Thread.sleep(100);
            count++;
        }
        System.out.println(count);
    }
}
