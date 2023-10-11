package task2_1_4_1_FiltratciyaFilter;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Draft_Task2_1_4_1 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Урок 4. Фильтрация (filter), перебор (forEach), Сортировка (sort). Цель задания: Совершенствование навыков работы с потоками, а также фильтрацией данных\s
                   Задание: Попробуйте создать поток рандомных чисел от -10  до 10,отфильтруйте их так, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль.

                Решение:\s""");
        Random random = new Random();
        System.out.println("Создаём рандомный поток из следующих чисел: ");
        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        System.out.println("Обрабатываем его с помощью Stream, согласно заданию: ");
        IntStream intStream2 = IntStream.generate(()->random.nextInt( -10, 11)).limit(10);
        intStream2.filter((a) -> a > 0).filter((a) -> a <= 10).sorted().forEach(System.out::println);
    }

}
