package task2_2_9_1_copy6_Example_kvai2_nextIterate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
// источник: https://youtu.be/ns1imummWPw  Урок по Java 75: Многопоточность 10: Wait and Notify пример
// отматываем назад от мин 10 38
public class ThreadExample_NextIterate {
    static List<String> strings = Collections.synchronizedList(new ArrayList<>());
    public static void main(String[] args) throws InterruptedException {
        new ThreadExample_NextIterate.Operator2().start();
        new ThreadExample_NextIterate.Machine2().start();
    }
    static class Operator2 extends Thread {
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                synchronized (strings) {
                    strings.add(scanner.nextLine());
                    strings.notify();
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class Machine2 extends Thread {
        @Override
        public void run() {
            while (strings.isEmpty()) {
                synchronized (strings) {
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(strings.remove(0));
                }
            }
        }
    }
}

