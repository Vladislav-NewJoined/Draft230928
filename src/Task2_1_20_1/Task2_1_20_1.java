package Task2_1_20_1;

import java.util.ArrayList;

// источник: Углубленный синтаксис Java/Тема 1. Stream Api. Функциональное программирование
// в Java/Урок 10. Перебор и группировка (map)
public class Task2_1_20_1 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Урок 20. Задание с использованием Stream Api.
                    Реализовать в  проекте пагинацию для того, чтобы каждая категория товара была в соответствующем каталоге (реализуйте не менее 3 категорий)
                    Реализовать сортировку товаров по цене,  фильтрацию относительно доступности товара в текущий момент для заказа
                    Реализовать навигационное меню состоящее из:
                    Каталог
                    Корзина
                    Оформление заказа
                    Назад

                Решение:\s""");


                ArrayList<Product> catalog = new ArrayList<>();

                catalog.add(new Product("Nokia 3310", 12345, 3));
                catalog.add(new Product("Samsung Galaxy S100", 50304, 7));
                catalog.add(new Product("IPhone 20", 392049, 1));
                catalog.add(new Product("Google Pixel 10a", 203421, 4));
                catalog.stream().map((product -> product.name)).forEach(x -> System.out.println(x/*.toUpperCase()*/));
            }
        }

        class Product {
            String name;
            int price;
            int deliveryTime;

            public Product(String name, int price,  int deliveryTime) {
                this.name = name;
                this.price = price;
                this.deliveryTime = deliveryTime;

            }
        }
