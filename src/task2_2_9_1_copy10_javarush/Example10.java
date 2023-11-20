package task2_2_9_1_copy10_javarush;

import java.util.concurrent.Executor;

public class Example10 {
    public static void main(String []args) throws Exception {
        Runnable task = () -> System.out.println("Task executed");
        Executor executor = (runnable) -> {
            new Thread(runnable).start();
        };
        executor.execute(task);
    }
}
