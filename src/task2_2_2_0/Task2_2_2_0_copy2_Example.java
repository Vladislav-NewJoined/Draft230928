package task2_2_2_0;

public class Task2_2_2_0_copy2_Example {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("""
                Задание:\s
                Модуль 2. Тема 2. Урок 2. Многопоточность Прерывание.
                    Задание 1. Напишите программу, которая сможет в одном потоке читать данные из консоли, 
                    а в другом потоке будет их выводить.

                Решение:\s""");

        MyThread2 t = new MyThread2();
        t.start();
        Thread.sleep(700);
        t.interrupt();

//        t.stopCounter();
    }
}

class MyThread2 extends Thread {
    int counter = 0;



//    boolean isAlive = true;
//    void stopCounter() {
//        isAlive = false;
//    }

    @Override
    public void run() {
        super.run();
        while (!isInterrupted()) {
            counter++;
        }
        System.out.println(counter);

//        while (isAlive) {
//            counter++;
//            try {
//                Thread.sleep(7);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(counter);
//

//        while (true) {
//            counter++;
    }
}
