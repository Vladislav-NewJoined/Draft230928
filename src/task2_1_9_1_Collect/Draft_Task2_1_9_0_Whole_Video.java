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
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Sasha", 4, 180));
        students.add(new Student("Zhenya", 5, 170));
        students.add(new Student("Vanya", 3, 180));
        students.add(new Student("Misha", 4, 190));
        students.add(new Student("Petya", 5, 170));
        students.add(new Student("Michael", 5, 160));
//        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getGrade)));

//// Способ 1
//        Map<Integer, List<Student>> groupedStudents = students.stream().collect(Collectors.groupingBy(Student::getGrade));
//        for (int grade : groupedStudents.keySet()) {
//            System.out.println("Получили " + grade + ":");
//            for (Student student : groupedStudents.get(grade)) {
//                System.out.println(student.name);
//            }
//        }
//// Способ 1 конец

//// Способ 2
//        Stream<Student> studentStream = students.stream();
////        Map<Integer, List<Student>> groupedStudents = studentStream.collect(Collectors.counting());
//        System.out.println("Количество студентов: " + studentStream.collect(Collectors.counting()));
//// Способ 2 конец

//// Способ 3
//        System.out.println("Способ 3");
//       Stream<Student> studentStream = students.stream();
////        Map<Integer, List<Student>> groupedStudents = studentStream.collect(Collectors.counting());
//        System.out.println("Количество студентов, имеющих соответствующий возраст: " + studentStream.collect(Collectors.groupingBy(Student::getGrade, Collectors.counting())));
//        System.out.println(); // перенос строки
//// Способ 3 конец

// Способ 4
        System.out.println("Способ 4");
       Stream<Student> studentStream4 = students.stream();
//        Map<Integer, List<Student>> groupedStudents = studentStream.collect(Collectors.counting());
        System.out.println("Количество студентов, имеющих соответствующий возраст: " + studentStream4.collect(Collectors.groupingBy(Student::getGrade, Collectors.summingInt(Student::getHeight))));
        System.out.println(); // перенос строки
// Способ 4 конец

    }
}

class Student {
    String name;
    int grade;
    int height;

    public Student(String name, int grade, int height) {
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
