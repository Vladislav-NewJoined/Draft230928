package task2_2_1_0;

public class Task2_2_1_1_copy2_dlyaDomashki {
//    Урок 1. Многопоточность, ThreadЦель
//    задания: Формирование навыков работы с потоками данных в JAVA
//    Задание:
//    1. Создать класс NewThread, расширяющий Thread.
//    2. Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
//    3. Создать экземпляр класса и запустить новый поток.
}

// 1.Создать класс NewThread, расширяющий Thread.
class Task2_2_1_1 {

    public static void main(String[] args) {
        Thread t2 = Thread.currentThread();
        System.out.println(t2.getName());

        Thread t = new NewThread();
        t.start();
    }

    private static class NewThread extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println(getName());
        }
    }
}


