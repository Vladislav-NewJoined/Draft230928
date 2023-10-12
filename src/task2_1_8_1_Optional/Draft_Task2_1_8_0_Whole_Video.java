package task2_1_8_1_Optional;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Draft_Task2_1_8_0_Whole_Video {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(3);
        Optional<Integer> value = numbers.stream().findFirst();
//        System.out.println(value.orElseThrow());
//        System.out.println(value.isPresent());
        value.ifPresent((n) -> System.out.println(n));
        value.ifPresentOrElse((n) -> System.out.println(n), () -> System.out.println("NaN")); // для домашки

//        ArrayList<Integer> numbers = new ArrayList<>();
////        numbers.add(3);
//        Optional<Integer> value = numbers.stream().findFirst();
//        System.out.println(value.orElse(-1));
//        System.out.println(value.orElseGet((() -> -1)));  // для домашки
//        System.out.println(value.orElseGet((() -> GetIfNaN())));  // для домашки
//        System.out.println(value.orElseGet((Draft_Task2_1_9_0_Whole_Video::GetIfNaN)));  // для домашки


//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(3);
//        Optional<Integer> value = numbers.stream().findFirst();
//        if (value.isPresent()) {
//            System.out.println(value.get());
//        }

//        ArrayList<Integer> numbers = new ArrayList<>();
//        Optional<Integer> value = numbers.stream().findFirst();
//        if (value.isPresent()) {
//            System.out.println(value.get());
//        }
//

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(0);
//        numbers.add(1);
//        numbers.add(2);
//        Optional<Integer> value = numbers.stream().findFirst();
//        System.out.println(value.get());

//        OptionalInt value = IntStream.range(0, 10).min();
//        System.out.println(value);


    }

    static int GetIfNaN() {
        return -1;
    }

// для домашки

    // -10 до 10. x^2-5x-10. Взять числа меньше 10. Вывести квадрат максимального числа.


}
