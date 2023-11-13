package task2_2_2_0;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// источник: https://youtu.be/tpv5n2jWHlw
// Эффективная работа с кодом в IntelliJ IDEA, или Знаете ли вы свою IDE как знаем её мы?
public class Task2_2_2_0_copy4_Example_Effektivnaia_rabota_s_kodom {
    public static void main(String[] args) throws IOException {
        System.out.println("""
                Задание:\s
                Модуль 2. Тема 2. Урок 2. Многопоточность Прерывание.
                    Задание. Из примера: Написать код, который читает из файла все строчки
                    и выводит их в output в отсортированном порядке.

                Решение:\s""");


        BufferedReader reader = new BufferedReader(new FileReader("src/task2_2_2_0/input.txt"));
        List<String> lines = new ArrayList<String>();
        String line;
        while ((line = reader.readLine()) != null ) {
            lines.add(line);
        }
        reader.close();
        String[] array = lines.toArray(new String[lines.size()]);
        Arrays.sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
