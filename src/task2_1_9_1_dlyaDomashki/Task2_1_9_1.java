package task2_1_9_1_dlyaDomashki;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Arrays.stream;

public class Task2_1_9_1 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Урок 9. Преобразование (collect).
                    Задание: Создайте поток каждым из предложенных в данном уроке способов.

                Решение:\s""");
        ArrayList<StudentsAge> studentsAge = new ArrayList<>();
        studentsAge.add(new StudentsAge("Саша", 19, 180));
        studentsAge.add(new StudentsAge("Женя", 20, 170));
        studentsAge.add(new StudentsAge("Ваня", 18, 180));
        studentsAge.add(new StudentsAge("Миша", 19, 190));
        studentsAge.add(new StudentsAge("Петя", 20, 170));
        studentsAge.add(new StudentsAge("Оля", 20, 160));

// Способ 1
        System.out.println("Способ 1");
        Map<Integer, List<StudentsAge>> groupedStudents = studentsAge.stream().collect(Collectors.groupingBy(StudentsAge::getAge));
        for (int age : groupedStudents.keySet()) {
            System.out.println("Имеют возраст " + age + " лет следующие студенты:");
            for (StudentsAge studentsAge2 : groupedStudents.get(age)) {
                System.out.println(studentsAge2.name);
            }
        }
        System.out.println(); // перенос строки
// Способ 1 конец

// Способ 2
        System.out.println("Способ 2");
        Stream<StudentsAge> studentStream = studentsAge.stream();
//        Map<Integer, List<Student>> groupedStudents = studentStream.collect(Collectors.counting());
        System.out.println("Количество студентов: " + studentStream.collect(Collectors.counting()));
        System.out.println(); // перенос строки
// Способ 2 конец

// Способ 3
        System.out.println("Способ 3");
        Stream<StudentsAge> studentStream2 = studentsAge.stream();
//        Map<Integer, List<Student>> groupedStudents = studentStream2.collect(Collectors.counting());
        System.out.println("Количество студентов, имеющих соответствующий возраст: " + studentStream2.collect(Collectors.groupingBy(StudentsAge::getAge, Collectors.counting())));
        System.out.println(); // перенос строки
// Способ 3 конец

// Способ 4
        System.out.println("Способ 4");
        Stream<StudentsAge> studentStream4 = studentsAge.stream();
//        Map<Integer, List<Student>> groupedStudents = studentStream2.collect(Collectors.counting());
        System.out.println("Просуммированный рост студентов, имеющих соответствующий возраст: " + studentStream4.collect(Collectors.groupingBy(StudentsAge::getAge, Collectors.summingInt(StudentsAge::getHeight))));
        System.out.println(); // перенос строки
// Способ 4 конец



    }
}

class StudentsAge {
    String name;
    int age;
    int height;


    public StudentsAge(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    int getAge() {
        return this.age;
    }

    int getHeight() {
        return this.height;
    }
}
