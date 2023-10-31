package Task2_1_20_1;

//import task2_1_9_1_Collect.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// источник: Углубленный синтаксис Java/Тема 1. Stream Api. Функциональное программирование
// в Java/Урок 10. Перебор и группировка (map)
public class Task2_1_20_1_copy3 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Урок 20. Задание с использованием Stream Api.
                    Реализовать в проекте пагинацию для того, чтобы каждая категория товара была в соответствующем каталоге (реализуйте не менее 3 категорий)
                    Реализовать сортировку товаров по цене,  фильтрацию относительно доступности товара в текущий момент для заказа
                    Реализовать навигационное меню состоящее из:
                    Каталог
                    Корзина
                    Оформление заказа
                    Назад

                Решение:\s""");

        ArrayList<Product3> catalog = new ArrayList<>();
        catalog.add(new Product3("Nokia 3310", 12345, 4));
        catalog.add(new Product3("Samsung Galaxy S100", 30000, 7));
        catalog.add(new Product3("IPhone 20", 392049, 1));
        catalog.add(new Product3("Google Pixel 10a", 30000, 4));
        System.out.println(catalog.stream().collect(Collectors.groupingBy(Product3::getPrice)));

        // Объявляем каталог Имя
        System.out.println("\nКаталог НАИМЕНОВАНИЕ: ");
        catalog.stream().map((product3 -> product3.name)).forEach(x -> System.out.println(x));
        System.out.println();

        // Объявляем каталог Цена
        System.out.println("Каталог ЦЕНА: ");
        catalog.stream().map((product3 -> product3.price)).forEach(y -> System.out.println(y));
        System.out.println();

        // Объявляем каталог Доступность на складе
        System.out.println("Каталог ДОСТУПНОСТЬ НА СКЛАДЕ: ");
        catalog.stream().map((product3 -> product3.availabilityInStock)).forEach(z -> System.out.println(z));
        System.out.println();

//        Arrays IntStream;
//        IntStream.stream().map((product3 -> product3.availabilityInStock)).forEach(System.out::println);

// Способ 1
        System.out.println("\nСпособ 1");
        Map<Integer, List<Product3>> groupedProduct3 = catalog.stream().collect(Collectors.groupingBy(Product3::getPrice));
        for (int price : groupedProduct3.keySet()) {
            System.out.print("Цена " + price + ": ");
            for (Product3 product3 : groupedProduct3.get(price)) {
                System.out.println(product3.name);
            }
        }
// Способ 1 конец

// Способ 2
        System.out.println("\nСпособ 2");
        Stream<Product3> catalogStream2 = catalog.stream();
//        Map<Integer, List<Student>> groupedStudents = studentStream.collect(Collectors.counting());
        System.out.println("Количество наименований товаров: " + catalogStream2.collect(Collectors.counting()));
// Способ 2 конец

// Способ 3
        System.out.println("\nСпособ 3");
        Stream<Product3> studentStream = catalog.stream();
//        Map<Integer, List<Student>> groupedStudents = studentStream.collect(Collectors.counting());
        System.out.println("Количество товаров, имеющие такую-то цену: " + studentStream.collect(Collectors.groupingBy(Product3::getPrice, Collectors.counting())));
// Способ 3 конец

// Способ 4
        System.out.println("\nСпособ 4");
        Stream<Product3> catalogStream4 = catalog.stream();
//        Map<Integer, List<Student>> groupedStudents = studentStream.collect(Collectors.counting());
        System.out.println("Количество единиц на складе для товаров, имеющие такую-то цену: " + catalogStream4.collect(Collectors.groupingBy(Product3::getPrice, Collectors.summingInt(Product3::getAvailabilityInStock))));
// Способ 4 конец

    }
}

class Product3 {
    String name;
    int price;
    int availabilityInStock;

    public Product3(String name, int price, int availabilityInStock) {
        this.name = name;
        this.price = price;
        this.availabilityInStock = availabilityInStock;
    }

    int getPrice() {
        return this.price;
    }

    int getAvailabilityInStock() {
        return this.availabilityInStock;
    }
}


