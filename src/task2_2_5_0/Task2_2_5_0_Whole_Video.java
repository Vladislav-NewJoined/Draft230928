package task2_2_5_0;

import java.util.concurrent.atomic.AtomicInteger;
// закончил на мин 12 50
class CommonResource {
    public AtomicInteger value = new AtomicInteger(0);

    void increment() {
        value.incrementAndGet();
    }
}


public class Task2_2_5_0_Whole_Video {
    public static void main(String[] args) throws InterruptedException {
        CommonResource res = new CommonResource();
        for (int i = 0; i < 10000; i++) {
            new MyThread(res).start();
        }
        Thread.sleep(2000);
        System.out.println(res.value);
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
    }
}




// ПРИМЕР 1
//class CommonResource {
//    public int value = 0;
//
//    synchronized void increment() {
//        value++;
//
////        int k = value + 1; // value = 10, k = 11;
////        int k = value + 1;
////        value = k; // value = 11;
////        value = k; // value = 11;
//    }
//}
//
//
//public class Task2_2_5_0_Whole_Video {
//    public static void main(String[] args) throws InterruptedException {
//        CommonResource res = new CommonResource();
//        for (int i = 0; i < 10000; i++) {
//            new MyThread(res).start();
//        }
//        Thread.sleep(2000);
//        System.out.println(res.value);
//    }
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
//        super.run();
//        res.increment();
//    }
//}
// КОНЕЦ примера 1
