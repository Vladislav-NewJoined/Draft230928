package Task2_1_20_1;

import java.util.ArrayList;
import java.util.Arrays;

// источник: Углубленный синтаксис Java/Тема 1. Stream Api. Функциональное программирование
// в Java/Урок 10. Перебор и группировка (map)
public class Task2_1_20_1_copy2 {
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


        ArrayList<Product2> catalog = new ArrayList<>();

        catalog.add(new Product2("Nokia 3310", 12345, 3));
        catalog.add(new Product2("Samsung Galaxy S100", 50304, 7));
        catalog.add(new Product2("IPhone 20", 392049, 1));
        catalog.add(new Product2("Google Pixel 10a", 203421, 4));

        // Объявляем каталог Имя
        System.out.println("Каталог НАИМЕНОВАНИЕ: ");
        catalog.stream().map((product2 -> product2.name)).forEach(x -> System.out.println(x));
        System.out.println();

        // Объявляем каталог Цена
        System.out.println("Каталог ЦЕНА: ");
        catalog.stream().map((product2 -> product2.price)).forEach(y -> System.out.println(y));
        System.out.println();

        // Объявляем каталог Доступность на складе
        System.out.println("Каталог ДОСТУПНОСТЬ НА СКЛАДЕ: ");
        catalog.stream().map((product2 -> product2.availabilityInStock)).forEach(z -> System.out.println(z));
        System.out.println();

//        Arrays IntStream;
//        IntStream.stream().map((product2 -> product2.availabilityInStock)).forEach(System.out::println);


    }
}

class Product2 {
    String name;
    int price;
    int availabilityInStock;

    public Product2(String name, int price, int availabilityInStock) {
        this.name = name;
        this.price = price;
        this.availabilityInStock = availabilityInStock;
    }
}

