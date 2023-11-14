package task2_2_2_1;

import java.util.Scanner;

// Из разбора домашнего задания _ // закончил на мин 7 08
public class Task2_2_2_1_copy6 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("РЕАЛИЗУЕМ СЕКУНДОМЕР В ПОТОКОВОМ МЕТОДЕ run " +
                "\n(для остановки секундомера поставьте курсор в консоль, " +
                "наберите любой текст и нажмите ENTER): ");
        TimerState6 state = new TimerState6();
        new TimerThread6(state).start();
        new InputThread6(state).start();
    }

}

class TimerState6 {
    int counter = 0;
    boolean isRunning = true;

    void increment() {
        System.out.println(counter++);

    }

    void stopTimer() {
        isRunning = false;
    }
}


class TimerThread6 extends Thread {
    final TimerState6 state;

    TimerThread6(TimerState6 state) {
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

class InputThread6 extends Thread {
    final TimerState6 state;

    InputThread6(TimerState6 state) {
        this.state = state;
    }

    @Override
    public void run() {
        super.run();
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        if (s != null) {
            state.stopTimer();
//            System.exit();
        }
    }
}

