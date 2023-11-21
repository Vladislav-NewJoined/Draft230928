package task2_2_9_1_copy12_javarus;

// источник: https://stackoverflow-com.translate.goog/questions/15997483/how-to-ensure-java-threads-run-in-a-particular-order?_x_tr_sl=en&_x_tr_tl=ru&_x_tr_hl=ru
public class Example12 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            Модуль 2. Тема 2. Урок 9. Многопоточность.
                Задание:
                  1. Создать класс расширяющий Thread
                  1.	Создать класс NewThread расширяющий Thread.
                  2.	Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
                  3.	Создать экземпляр класса и запустить новый поток.
                  2. Создать класс реализующий Runnable
                  1.	Создать класс, реализующий интерфейс Runnable.
                  2.	Переопределить run() метод. Создать цикл for. В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка.
                  3.	Используем статический метод Thread.sleep(), чтобы сделать паузу.
                  4.	Создать три потока, выполняющих задачу распечатки значений.

            Решение:\s""");

        Thread t4 = new Thread(new T4());
        Thread t5 = new Thread(new T5());
        Thread t6 = new Thread(new T6());
        Thread t7 = new Thread(new T7());

        t4.start();
        try {
            t4.join();
            t5.start();
            t5.join();
            t6.start();
            t6.join();
            t7.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class T4 implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(12);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("""
                    4. Реализуем решение по Заданию 2. Создать класс реализующий Runnable.
                    1.	Создать класс, реализующий интерфейс Runnable.
                    Реализовано на примере создания счётчика от 1-го до 5-ти:""");

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Runnable count " + (i + 1));
            }
            System.out.println();
        }
    }

    static class T5 implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(12);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("""
                    5. Реализуем решение по Заданию 2. Создать класс реализующий Runnable.
                    2. Переопределить run() метод. Создать цикл for. В цикле распечатываем значения
                    от 0 до 100 делящиеся на 10 без остатка:""");

            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i % 10 == 0) {
                    System.out.println(i);
                }
            }
            System.out.println();
        }
    }

    static class T6 implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(12);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("""
                    6. Реализуем решение по Заданию 2. Создать класс реализующий Runnable.
                    3. Используем статический метод Thread.sleep(), чтобы сделать паузу.
                    Реализовано путём создания паузы 1200 миллисекунд между выводом на печать\s
                    значений счетчика '1' и '2':""");

            for (int i = 0; i < 2; i++) {
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Counter value: " + (i + 1));
            }
            System.out.println();
        }
    }

    static class T7 implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(12);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("""
                    7. Реализуем решение по Заданию 2. Создать класс реализующий Runnable.\s
                    4. Создать три потока, выполняющих задачу распечатки значений.
                    Реализовано на примере вывода уведомлений о старте и финише трёх потоков:""");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("Thread" + (i + 1) + " started");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("Thread" + (i + 1) + " finished");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.exit(0);
        }
    }
}
