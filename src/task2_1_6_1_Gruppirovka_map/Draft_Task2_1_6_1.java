package task2_1_6_1_Gruppirovka_map;

import java.util.ArrayList;

public class Draft_Task2_1_6_1 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Урок 6. Перебор и группировка (map).
                    Задание: Необходимо вывести большими буквами названия всех продуктов из магазина 
                    электроники, написанного на уроке.

                Решение:\s""");

        ArrayList<Product> catalog = new ArrayList<>();

        catalog.add(new Product("Nokia 3310", 12345676));
        catalog.add(new Product("Samsung Galaxy S100", 50304));
        catalog.add(new Product("IPhone 20", 392049));
        catalog.add(new Product("Google Pixel 10a", 203421));
        catalog.stream().map((product -> product.name)).forEach(x -> System.out.println(x.toUpperCase()));
    }
}

class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}