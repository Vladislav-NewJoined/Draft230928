// закончил на мин 05 35
package task2_2_2_0;

public class Task2_2_2_0_Whole_Video {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(700);
        t.interrupt();

//        t.stopCounter();
    }
}

class MyThread extends Thread {
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
