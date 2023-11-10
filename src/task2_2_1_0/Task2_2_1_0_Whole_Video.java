package task2_2_1_0;

public class Task2_2_1_0_Whole_Video {
//    Урок 1. Многопоточность, ThreadЦель
//    задания: Формирование навыков работы с потоками данных в JAVA
//    Задание:
//    1.Создать класс NewThread, расширяющий Thread.
//    2.Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
//    3.Создать экземпляр класса и запустить новый поток
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        Thread t2 = new MyThred();
        t2.start();
//        t2.run();

    }
}

class MyThred extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(getName());
    }
}
