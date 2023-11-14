package task2_2_4_1;

import java.util.concurrent.Semaphore;

public class Task2_2_3_4_Iz_videouroka {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Модуль 2. Тема 2. Урок 4. Многопоточность. Семофоры.
                    Задание 1 из видеоурока. Имеются два поезда. Каждый из них должен заехать в
                    депо. Причем каждый должен обследоваться два раза.

                Решение:\s""");

        final int n = 10;
        final Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < n; i++) {
            new Train(semaphore, i).start();
        }
    }
}


class Train extends Thread {

    final Semaphore semaphore;
    final int id;

    int count = 0;

    Train(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @Override
    public void run() {
        super.run();
        try {
            while (count < 2) {

                semaphore.acquire();
                System.out.println("Поезд " + id + " заехал в депо");
                sleep(500);
                System.out.println("Поезд " + id + " выехал из депо");
                semaphore.release();
                sleep(500);
                count++;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
1. Поездов несколько (N)
2. Одновременно в депо не более 2 поездов
3. Каждый презд должен заехать в депо 2 раза

*/


