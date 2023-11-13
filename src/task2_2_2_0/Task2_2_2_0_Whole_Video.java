// закончил на мин 05 35
package task2_2_2_0;

public class Task2_2_2_0_Whole_Video {
    public static void main(String[] args) throws InterruptedException {
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
            count++;
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()
                        + " has been interrupted");
                System.out.println(Thread.currentThread().isInterrupted());
                break;
            }
        }
        System.out.println(count);
    }
}


//class MyThread implements Runnable {
//
//    int count = 0;
//
//    @Override
//    public void run() {
//        try {
//        while (!Thread.currentThread().interrupted()) {
////            Thread.sleep(100);
//            count++;
//                Thread.sleep(2);
//        }
//    } catch (InterruptedException e) {
//        System.out.println(Thread.currentThread().getName()
//                + " has been interrupted");
//        System.out.println(Thread.currentThread().isInterrupted());
////        Thread.currentThread().interrupt();
//    }
//        System.out.println(count);
//    }
//}


//class MyThread implements Runnable {
//
//    int count = 0;
//
//    @Override
//    public void run() {
//        try {
//        while (!Thread.currentThread().interrupted()) {
////            Thread.sleep(100);
//            count++;
//                Thread.sleep(2);
//        }
//    } catch (InterruptedException e) {
//        System.out.println(Thread.currentThread().getName()
//                + " has been interrupted");
//        System.out.println(Thread.currentThread().isInterrupted());
//        Thread.currentThread().interrupt();
//    }
//        System.out.println(count);
//    }
//}


//class MyThread implements Runnable {
//
//    int count = 0;
//
//    @Override
//    public void run() {
//        while (!Thread.currentThread().interrupted()) {
////            Thread.sleep(100);
//            count++;
//            try {
//                Thread.sleep(2);
//            } catch (InterruptedException e) {
//                System.out.println(Thread.currentThread().getName()
//                        + " has been interrupted");
//                System.out.println(Thread.currentThread().isInterrupted());
//                Thread.currentThread().interrupt();
//            }
//        }
//        System.out.println(count);
//    }
//}


//class MyThread implements Runnable {
//
//    int count = 0;
//
//    @Override
//    public void run() {
//        while (!Thread.currentThread().interrupted()) {
////            Thread.sleep(100);
//            count++;
//        }
//        System.out.println(count);
//    }
//}
//




//class MyThread extends Thread {
//    int counter = 0;
//
//
//
////    boolean isAlive = true;
////    void stopCounter() {
////        isAlive = false;
////    }
//
//    @Override
//    public void run() {
//        super.run();
//        while (!isInterrupted()) {
//            counter++;
//        }
//        System.out.println(counter);
//
////        while (isAlive) {
////            counter++;
////            try {
////                Thread.sleep(7);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////        }
////        System.out.println(counter);
////
//
////        while (true) {
////            counter++;
//    }
//}
