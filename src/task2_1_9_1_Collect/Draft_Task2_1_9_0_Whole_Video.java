package task2_1_9_1_Collect;
// закончил на мин 03 20
// 2 способ на мин 11 46
// 3 способ на мин 13 10
// 4 способ на мин 14 27

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Arrays.stream;

public class Draft_Task2_1_9_0_Whole_Video {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Урок 9. Преобразование (collect).
                    Задание: Создайте поток каждым из предложенных в данном уроке способов.

                Решение:\s""");
        ArrayList<Product3> product3s = new ArrayList<>();
        product3s.add(new Product3("Sasha", 4, 180));
        product3s.add(new Product3("Zhenya", 5, 170));
        product3s.add(new Product3("Vanya", 3, 180));
        product3s.add(new Product3("Misha", 4, 190));
        product3s.add(new Product3("Petya", 5, 170));
        product3s.add(new Product3("Michael", 5, 160));
//        System.out.println(product3s.stream().collect(Collectors.groupingBy(Product3::getGrade)));

//// Способ 1
//        Map<Integer, List<Product3>> groupedStudents = product3s.stream().collect(Collectors.groupingBy(Product3::getGrade));
//        for (int grade : groupedStudents.keySet()) {
//            System.out.println("Получили " + grade + ":");
//            for (Product3 student : groupedStudents.get(grade)) {
//                System.out.println(student.name);
//            }
//        }
//// Способ 1 конец

//// Способ 2
//        Stream<Product3> studentStream = product3s.stream();
////        Map<Integer, List<Product3>> groupedStudents = studentStream.collect(Collectors.counting());
//        System.out.println("Количество студентов: " + studentStream.collect(Collectors.counting()));
//// Способ 2 конец

//// Способ 3
//        System.out.println("Способ 3");
//       Stream<Product3> studentStream = product3s.stream();
////        Map<Integer, List<Product3>> groupedStudents = studentStream.collect(Collectors.counting());
//        System.out.println("Количество студентов, имеющих соответствующий возраст: " + studentStream.collect(Collectors.groupingBy(Product3::getGrade, Collectors.counting())));
//        System.out.println(); // перенос строки
//// Способ 3 конец

// Способ 4
        System.out.println("Способ 4");
       Stream<Product3> studentStream4 = product3s.stream();
//        Map<Integer, List<Product3>> groupedStudents = studentStream.collect(Collectors.counting());
        System.out.println("Количество студентов, имеющих соответствующий возраст: " + studentStream4.collect(Collectors.groupingBy(Product3::getGrade, Collectors.summingInt(Product3::getHeight))));
        System.out.println(); // перенос строки
// Способ 4 конец

    }
}

class Product3 {
    String name;
    int grade;
    int height;

    public Product3(String name, int grade, int height) {
        this.name = name;
        this.grade = grade;
        this.height = height;
    }

    int getGrade() {
        return this.grade;
    }

    int getHeight() {
        return this.height;
    }
}
