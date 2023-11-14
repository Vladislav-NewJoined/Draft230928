package task2_2_2_1;
import java.util.Scanner;
// Из разбора домашнего задания _ // закончил на мин
public class Task2_2_2_1_copy6 {

    public static void main(String[] args) throws InterruptedException {

    }

}


class TimerThread6 extends Thread {
    int counter = 0;

    @Override
    public void run() {
        super.run();
        while (!isInterrupted()) {
            System.out.println(counter++);
        }
    }
}

class InputThread6 extends Thread {


    @Override
    public void run() {
        super.run();
        while (!isInterrupted()) {
//            System.out.println(counter++);
        }
    }
}

