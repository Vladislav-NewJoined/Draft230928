package task2_2_1_1;

public class Task2_2_1_1 {

    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Урок 1. Многопоточность, Thread.
                    1. Создать класс NewThread расширяющий Thread.

                Решение:\s""");

        Thread t = new NewThread();
        t.start();
    }
}

class NewThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(getName());
    }
}
