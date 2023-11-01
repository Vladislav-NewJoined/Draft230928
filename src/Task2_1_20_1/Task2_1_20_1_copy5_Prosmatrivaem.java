package Task2_1_20_1;

import java.util.stream.IntStream;

public class Task2_1_20_1_copy5_Prosmatrivaem {
    // Урок 7. Введение в StreamApi, создание потока данных - delat

    public static void main(String[] args) {
        // СЛЕДУЮЩЕЕ:
        // Урок 7. Введение в StreamApi, создание потока данных.
        // Самое полезное с 20-й минуты.
        int[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
//        int summary = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]>0) {
//                summary += array[i];
//            }
//        }
//        System.out.println(summary);

        System.out.println(IntStream.of(array).filter((a) -> a > 0).sum());
        // КОНЕЦ.


    }


}
