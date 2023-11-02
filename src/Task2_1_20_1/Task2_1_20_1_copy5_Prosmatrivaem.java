package Task2_1_20_1;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;


// Как распечатать объект Java без получения "SomeType@2f92e0f4"? https://kzen.dev/ru/60738586?ysclid=loh2rrv5bm45130889
public class Task2_1_20_1_copy5_Prosmatrivaem {
    // Урок 7. Введение в StreamApi, создание потока данных -

    public static void main(String[] args) {
        // СЛЕДУЮЩЕЕ:
        // Урок 7. Введение в StreamApi, создание потока данных.
        // Самое полезное с 20-й минуты.
        // Про arrayList.stream() с мин 20 50 - это создание стрима из коллекции
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



// Урок 8. Фильтрация (filter), перебор (forEach), Сортировка (sort) - delat
// или на листке: Урок 4. Фильтрация (filter), перебор (forEach), Сортировка (sort)
// Person с мин 07 36
class Main {
    public static void main(String[] args) {
//        // СЛЕДУЮЩЕЕ:
//        Random random = new Random();
////        System. out. println(IntStream. generate(() -> random.nextInt (10)).limit (10).sum());
//        IntStream.generate(() -> random.nextInt(10)).limit(10).forEach(System.out::println);
//        // КОНЕЦ.


//        // СЛЕДУЮЩЕЕ:
//        Random random = new Random();
//        IntStream intStream = IntStream.generate(() -> random.nextInt(10)).limit(10);
////        intStream.filter((a)-> a > 5).filter((a)-> a < 9).forEach(System.out::println);
////        System.out.println();
//        intStream.sorted().forEach(System.out::println);
//        // КОНЕЦ.

        // СЛЕДУЮЩЕЕ:
        Stream<Person> stream = Stream.of(new Person("Миша"), new Person("Женя"), new Person("Настя"));
//        stream.sorted().forEach(System.out::println);
        stream.sorted(new PersonComparator()).forEach(System.out::println);
        // КОНЕЦ.



    }

//    private static class Person {
//        private String name;
//
//        public Person(String name) {
//            this.name = name;
//        }
//
//        public Person() {
//            this.name = "Имя по умолчанию";
//        }
//
//        public void setName(String name) { this.name = name; }
//    }
}

class Person {

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }



//    private String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public Person() {
//        this.name = "Имя по умолчанию";
//    }
//
//    public void setName(String name) { this.name = name; }

// В видеоуроке сделано так:
    String name;

    public Person(String name) {
        this.name = name;
    }
}

//// Потом в видеоуроке он сделал его компарейбл:
//class Person implements Comparable<Person> {
//
//// В видеоуроке сделано так:
//    String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
////    @Override
////    public String toString() {
////        return name;
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Person o) {
//        return name.compareTo(o.name);
//    }
//}

// или с Компаратор:
class PersonComparator implements Comparator<Person> {

    String name;

    public void Person(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}


