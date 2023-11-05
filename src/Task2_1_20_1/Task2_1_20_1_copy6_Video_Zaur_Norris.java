package Task2_1_20_1;

import java.util.*;
import java.util.stream.Collectors;

// источник: https://www.youtube.com/playlist?list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs _ весь плейлист  Заур Трегулов
public class Task2_1_20_1_copy6_Video_Zaur_Norris {

}

// источник: https://youtu.be/oTdm_CVIdJM Введение в Streams. Метод map (прокачанная Java) _ Заур Трегулов
// делится на 3: мин 10 12
class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

//            // 6 9 2 4
//            List<Integer> list2 = list.stream().map(element -> element.length())
//                    .collect(Collectors.toList());
//            System.out.println(list2);

        // Метод sorted
        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element
                -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();

//        System.out.println(Arrays.toString(array));

    }
}


// источник: https://youtu.be/C7uDcRGiwg8 Streams. Метод filter (прокачанная Java) _ Заур Трегулов
// Метод filter: мин 1 25
class Test2 {
    public static void main(String[] args) {
        Student st1 = new Student("Inan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>(); // zdes doljen bit List
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

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

        // Метод sorted
        students = students.stream().sorted((x,y) ->
        x.getName().compareTo(y.getName())
        ).collect(Collectors.toList());
        System.out.println(students);
        System.out.println();

        students = students.stream().sorted(Comparator.comparing((Student x) -> x.getName())
        ).collect(Collectors.toList());
        System.out.println(students);

    }
}

// источник: https://www.youtube.com/watch?v=Fn02Fd548UY&list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs&index=55
// Streams. Метод collect: grouping и partitioning (прокачанная Java)_Заур Трегулов
class Test4 {

}

// источник: https://youtu.be/7hSTTLSW7Rw  Zaur_Norris
// Streams. Метод sorted (прокачанная Java)
class Test5_Zaur_Norris {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

    }
}

// источник: https://youtu.be/5GU_zsDyS5k?list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs  Zaur_Norris
// Streams. Method chaining (прокачанная Java)
class Test6_Zaur_Norris {
    public static void main(String[] args) {

    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
        this.setCourse(course);
        this.setAvgGrade(avgGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", sex=" + getSex() +
                ", age=" + getAge() +
                ", course=" + getCourse() +
                ", avgGrade=" + getAvgGrade() +
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
