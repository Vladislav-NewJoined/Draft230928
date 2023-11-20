package task2_2_9_1_copy9_javarush;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// источник: https://javarush.com/groups/posts/2078-threadom-java-ne-isportishjh--chastjh-v---executor-threadpool-fork-join-pool
public class Example9 {
    static final List<String> strings = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Task executed");
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}

class MyThread6 implements Runnable {

    @SuppressWarnings("BusyWait")
    @Override
    public void run() {

        synchronized (Example9.strings) {
//            try {
//                strings.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            // 6. 3.	Используем статический метод Thread.sleep(), чтобы сделать паузу.
            System.out.println("6. Реализуем решение по Заданию 2. Создать класс реализующий Runnable. " +
                    "3. Используем статический метод Thread.sleep(), чтобы сделать паузу." +
                    "\nДелаем паузу 800 миллисекунд между выводом на печать значений счетчика 1 и 2:");

            for (int i = 0; i < 2; i++) {
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Значение счетчика: " + /*count*/ (i + 1));
            }
            System.out.println();
            Example9.strings.notify();
        }
    }
}
