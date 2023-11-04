package Task2_1_20_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// источник: https://www.youtube.com/watch?v=nEabP9CYCAQ  _ Владилен Минин
public class Task2_1_20_1_copy8_Video_Vladilen_Minin {
}

class Test5 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 'm', 22, 3, 8.3);
        Student2 st2 = new Student2("Nikolay", 'm', 28, 2, 6.4);
        Student2 st3 = new Student2("Elena", 'f', 19, 1, 8.9);
        Student2 st4 = new Student2("Petr", 'm', 35, 4, 7);
        Student2 st5 = new Student2("Mariya", 'f', 23, 3, 7.4);

        List<Student2> students = new ArrayList<>(); // zdes doljen bit List

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        students.stream().filter(element
//                        -> element.getAge() > 20 && element.getAvgGrade() > 7.2)
//                .toList().forEach(System.out::println);
//        System.out.println(students); // печатает изначальный массив

//        List<String> newStudents = students.stream().map(person -> {
//            return "Hello";
//        }).toList();
//        System.out.println(newStudents);

//        students.stream().map(person -> {
//            return "Hello";
//        }).toList().forEach(System.out::println);

//        students.stream().map(person -> {
//            return person;
//        }).toList().forEach(System.out::println);

        students.stream().map(person -> person.getAge()*3).toList().forEach(System.out::println); //
        // https://www.youtube.com/watch?v=nEabP9CYCAQ Владилен Минин _ мин 8 58















// Это как у Заура
//        students = students.stream().filter(element
//                ->element.getAge() > 22 && element.getAvgGrade() < 7.2)
//                .collect(Collectors.toList());
//        System.out.println(students);

//        students.stream().filter(element
//                        ->element.getAge() > 22 && element.getAvgGrade() < 7.2)
//                .collect(Collectors.toList()).forEach(System.out::println);

//        students.stream().filter(element
//                        ->element.getAge() > 22 && element.getAvgGrade() < 7.2)
//                .forEach(System.out::println);

//        students.stream().filter(element
//                        -> element.getAge() > 22 && element.getAvgGrade() < 7.2)
//                .toList().forEach(System.out::println);
    }
}

class Student2 {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student2(String name, char sex, int age, int course, double avgGrade) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
        this.setCourse(course);
        this.setAvgGrade(avgGrade);
    }

    @Override
    public String toString() {
        return "Student2: {" +
                "name: '" + getName() + '\'' +
                ", sex: " + getSex() +
                ", age: " + getAge() +
                ", course: " + getCourse() +
                ", avgGrade: " + getAvgGrade() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

}
