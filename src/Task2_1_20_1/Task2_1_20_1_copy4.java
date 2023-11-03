package Task2_1_20_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// источник: Углубленный синтаксис Java/Тема 1. Stream Api. Функциональное программирование
// в Java/Урок 10. Перебор и группировка (map)
public class Task2_1_20_1_copy4 {
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

        ArrayList<Product4> catalog = new ArrayList<>();
        catalog.add(new Product4("Nokia 3310", 12345, 4));
        catalog.add(new Product4("Samsung Galaxy S100", 30000, 7));
        catalog.add(new Product4("IPhone 20", 392049, 1));
        catalog.add(new Product4("Google Pixel 10a", 30000, 4));
        System.out.println(catalog.stream().collect(Collectors.groupingBy(Product4::getPrice)));

        // Объявляем каталог Название
        System.out.println("\nКаталог НАИМЕНОВАНИЕ: ");
        catalog.stream().map((product4 -> product4.name)).forEach(x -> System.out.println(x));
        System.out.println();

        // Объявляем каталог Цена
        System.out.println("Каталог ЦЕНА: ");
        catalog.stream().map((product4 -> product4.price)).forEach(y -> System.out.println(y));
        System.out.println();

        // Объявляем каталог Доступность на складе
        System.out.println("Каталог ДОСТУПНОСТЬ НА СКЛАДЕ: ");
        catalog.stream().map((product4 -> product4.availabilityInStock)).forEach(z -> System.out.println(z));

//        Arrays IntStream;
//        IntStream.stream().map((product4 -> product4.availabilityInStock)).forEach(System.out::println);

        System.out.println("\nГРУППИРУЕМ РАЗНЫМИ СПОСОБАМИ:");
// Способ 1
        System.out.println("Способ 1");
        Map<Integer, List<Product4>> groupedProduct4 = catalog.stream().collect(Collectors.groupingBy(Product4::getPrice));
        for (int price : groupedProduct4.keySet()) {
            System.out.print("Цена " + price + ": ");
            for (Product4 product4 : groupedProduct4.get(price)) {
                System.out.println(product4.name);
            }
        }
// Способ 1 конец

// Способ 2
        System.out.println("\nСпособ 2");
        Stream<Product4> catalogStream2 = catalog.stream();
//        Map<Integer, List<Student>> groupedStudents = catalogStream2.collect(Collectors.counting());
        System.out.println("Количество наименований товаров: " + catalogStream2.collect(Collectors.counting()));
// Способ 2 конец

// Способ 3
        System.out.println("\nСпособ 3");
        Stream<Product4> catalogStream3 = catalog.stream();
//        Map<Integer, List<Student>> groupedStudents = catalogStream3.collect(Collectors.counting());
        System.out.println("Количество товаров, имеющие такую-то цену: " + catalogStream3.collect(Collectors.groupingBy(Product4::getPrice, Collectors.counting())));
// Способ 3 конец

// Способ 4
        System.out.println("\nСпособ 4");
        Stream<Product4> catalogStream4 = catalog.stream();
//        Map<Integer, List<Student>> groupedStudents = catalogStream4.collect(Collectors.counting());
        System.out.println("Количество единиц на складе для товаров, имеющие такую-то цену: " + catalogStream4.collect(Collectors.groupingBy(Product4::getPrice, Collectors.summingInt(Product4::getAvailabilityInStock))));
// Способ 4 конец

        System.out.println("\nРЕАЛИЗУЕМ НАВИГАЦИОННОЕ МЕНЮ, СОСОЯЩЕЕ ИЗ РАЗДЕЛОВ:");
        System.out.println("КАТАЛОГ:");
// Берем отсюда: Урок 10. Перебор и группировка (map) (на листке: Урок 6. Перебор и группировка (map))
//        catalog.stream().map((product -> product.name)).forEach(x -> System.out.println(x.toUpperCase()));

        catalog.stream().map((product -> "Название: " + product.name + ", " + "Цена: " +
                        product.price + ", " + "Наличие на складе: " + product.availabilityInStock + ".")).
                forEach(System.out::println);

        System.out.println();
        System.out.println("КОРЗИНА:");
// Берем отсюда: Урок 10. Перебор и группировка (map) (на листке: Урок 6. Перебор и группировка (map))
//        catalog.stream().map((product -> product.name)).forEach(x -> System.out.println(x.toUpperCase()));

//        catalog.stream().map((product -> "Название: " + product.name + ", " + "Цена: " +
//                product.price + ", " + "Наличие на складе: " + product.availabilityInStock + ".")).forEach(System.out::println);

        catalog.stream().map((product -> product.price == 30000));

        catalog.stream().map((product -> "Название: " + product.name + ", " + "Цена: " +
                        product.price + ", " + "Наличие на складе: " + product.availabilityInStock + ".")).
                forEach(System.out::println);



//                "Название: " + filterProduct.name + ", " + "Цена: " +
//                filterProduct.price + ", " + "Наличие на складе: " + filterProduct.availabilityInStock + ".")).forEach(System.out::println);

//        catalog.stream().filter((a) -> name > 0);

    }
}

class Product4 {
    String name;
    int price;
    int availabilityInStock;

    public Product4(String name, int price, int availabilityInStock) {
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
