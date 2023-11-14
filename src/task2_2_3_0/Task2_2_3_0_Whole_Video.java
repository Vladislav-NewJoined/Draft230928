package task2_2_3_0;

public class Task2_2_3_0_Whole_Video {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        for (int i = 0; i < 6; i++) {
            Thread t = new MyThread(commonResource);
            t.setName("Thread " + i);
            t.start();
        }
    }
}

class CommonResource {
    int x = 0;

    synchronized void increment() {
        x = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + x);
            x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class MyThread extends Thread {
    final CommonResource res;

    MyThread(CommonResource res) {
        this.res = res;
    }

    @Override
    public void run() {

            super.run();
            res.increment();
//            res.x = 1;
//            for (int i = 0; i < 5; i++) {
//                System.out.println(Thread.currentThread().getName() + " " + res.x);
//                res.x++;
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
    }
}

class Store {
    int maxProductCount = 3;
    int product = 0;

    void get() {}
    void put() {}
}

class Producer extends Thread {}
class Consumer extends Thread {}






// ПРИМЕР 1
//public static void main(String[] args) {
//    CommonResource commonResource = new CommonResource();
//    for (int i = 0; i < 6; i++) {
//        Thread t = new MyThread(commonResource);
//        t.setName("Thread " + i);
//        t.start();
//    }
//}
//}
//
//class CommonResource {
//    int x = 0;
//}
//
//class MyThread extends Thread {
//    final CommonResource res;
//
//    MyThread(CommonResource res) {
//        this.res = res;
//    }
//
//    @Override
//    public void run() {
//        synchronized (res) {
//            super.run();
//            res.x = 1;
//            for (int i = 0; i < 5; i++) {
//                System.out.println(Thread.currentThread().getName() + " " + res.x);
//                res.x++;
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}
//
// КОНЕЦ примера 1
