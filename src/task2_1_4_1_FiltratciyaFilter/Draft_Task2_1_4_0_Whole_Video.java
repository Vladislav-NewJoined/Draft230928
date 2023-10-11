package task2_1_4_1_FiltratciyaFilter;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// мин 01 30 - foreach
// мин 04 15 - filter
class Person /*implements Comparable <Person>*/ {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

/*    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }*/
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Draft_Task2_1_4_0_Whole_Video {




    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Урок 4. Фильтрация (filter), перебор (forEach), Сортировка (sort). Цель задания: Совершенствование навыков работы с потоками, а также фильтрацией данных\s
                   Задание: Попробуйте создать поток рандомных чисел от -10  до 10,отфильтруйте их так, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль.

                Решение:\s""");

        Stream<Person> stream = Stream.of(new Person("Миша"), new Person("Женя"),
                new Person("Настя"));
        stream.sorted(new PersonComparator()).forEach(System.out::println);







//        Random random = new Random();
////        IntStream.generate(()->random.nextInt( 10)).limit(10).forEach((a) -> System.out.println(a));
////        IntStream.generate(()->random.nextInt( 10)).limit(10).forEach(System.out::println);
//        IntStream intStream = IntStream.generate(()->random.nextInt( -10, 11)).limit(10);
////        intStream.forEach(System.out::println);
////        intStream.filter((a) -> a > 1).filter((a) -> a < 9).forEach(System.out::println);
//        intStream.sorted().forEach(System.out::println);




// СЛЕДУЮЩЕ:
        System.out.println("\nдля домашки: ");
// для домашки
        Random random = new Random();
//        IntStream intStream = IntStream.generate(()->random.nextInt( -10, 11)).limit(10);
//        intStream.forEach(System.out::println);
////        intStream.filter().forEach(System.out::println);
        IntStream intStream2 = IntStream.generate(()->random.nextInt( -10, 11)).limit(10);
        intStream2.filter((a) -> a > 0).filter((a) -> a <= 10).forEach(System.out::println);


// СЛЕДУЮЩЕ:
//        Random random = new Random();
//        System.out.println(IntStream.generate(()->random.nextInt( 10)).limit(10).sum());
    }

}
