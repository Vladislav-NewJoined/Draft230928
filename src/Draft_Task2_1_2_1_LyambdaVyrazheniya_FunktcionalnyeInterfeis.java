import java.util.function.Function;

public class Draft_Task2_1_2_1_LyambdaVyrazheniya_FunktcionalnyeInterfeis {
    public static void main(String[] args) {
        System.out.println("""
                Задание для Урока 2. Лямбда-выражения, функциональные интерфейсы:\s
                1. Написать лямбда выражение, которое принимает на вход число и возвращает
                   значение “Положительное число”, “Отрицательное число” или “Ноль”. Используем
                   функциональный интерфейс Function.

                Решение:\s""");

        Function<Integer, String> function = i -> {
            String result = "Ноль";
            if (i > 0) {
                result = "Положительное число";
            } else if (i < 0) {
                result = "Отрицательное число";
            }
            return result;
        };

        System.out.println(function.apply(-9));
        System.out.println(function.apply(0));
        System.out.println(function.apply(99));
    }
}