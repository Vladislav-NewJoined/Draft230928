package task2_2_2_1;


import java.util.Scanner;
// Из разбора домашнего задания _ // закончил на мин 07 46
public class Task2_2_2_1_copy5 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("РЕАЛИЗУЕМ СЕКУНДОМЕР В ПОТОКОВОМ МЕТОДЕ run " +
                "\n(для остановки секундомера поставьте курсор в консоль, " +
                "наберите любой текст и нажмите ENTER): ");
        TimerState5 state = new TimerState5();
        new TimerThread5(state).start();
        new inputThread5(state).start();
    }

}

class TimerState5 {
    int counter = 0;
    boolean isRunning = true;

    void increment() {
        System.out.println(counter++);

    }

    void stopTimer() {
        isRunning = false;
    }
}


class TimerThread5 extends Thread {
    final TimerState5 state;

    TimerThread5(TimerState5 state) {
        this.state = state;
    }


    @Override
    public void run() {
        super.run();
        try {
            while (state.isRunning) {
                state.increment();
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class inputThread5 extends Thread {
    final TimerState5 state;

    inputThread5(TimerState5 state) {
        this.state = state;
    }

    @Override
    public void run() {
//        System.out.println("РЕАЛИЗУЕМ ПРЕРЫВАНИЕ ПОТОКА: ");
        super.run();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s != null) {
            state.stopTimer();
        }
    }
}

