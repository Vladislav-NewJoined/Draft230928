package task2_2_9_1_copy4_Example_kvai;

import task2_2_9_1_copy3_Example.Task2_2_9_1_copy3_Example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Task2_2_9_1_copy4_Example_kvai {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue/*<String>*/ queue = new PriorityBlockingQueue/*<>*/();

        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                queue.add("this is string");
            }
        }.start();
    }
}
