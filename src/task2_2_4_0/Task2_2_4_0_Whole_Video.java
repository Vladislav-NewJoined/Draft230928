package task2_2_4_0;

import java.util.concurrent.Semaphore;

public class Task2_2_4_0_Whole_Video {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 10; i++) {
            new MyThread(semaphore).start();
        }
    }
}

class MyThread extends Thread {
    final Semaphore semaphore;

    MyThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        super.run();
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
//            e.printStackTrace();
        }
        System.out.println(getName() + " started...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
//            e.printStackTrace();
        }
        System.out.println(getName() + " finished...");
        semaphore.release();
    }
}
