package Task2_1_20_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// источник: https://www.youtube.com/playlist?list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs  - Заур Трегулов
public class Task2_1_20_1_copy7 {
}

// Streams. Метод filter (прокачанная Java)  https://youtu.be/C7uDcRGiwg8
// Метод filter: мин 1 25
class Test3 {
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


        Products prod1 = new Products("Nokia 3310", 12345, 4, 0);
        Products prod2 = new Products("Samsung Galaxy S100", 30000, 7, 0);
        Products prod3 = new Products("IPhone 20", 392049, 1, 0);
        Products prod4 = new Products("Google Pixel 10a", 30000, 4, 0);
        List<Products> catalog = new ArrayList<>();
        catalog.add(prod1);
        catalog.add(prod2);
        catalog.add(prod3);
        catalog.add(prod4);

        // Объявляем список: Название
        System.out.println("\nСписок: НАИМЕНОВАНИЕ: ");
        catalog.stream().map((product -> product.getName())).forEach(System.out::println);

        // Объявляем список: Цена
        System.out.println("\nСписок: ЦЕНА: ");
        catalog.stream().map((product -> product.getPrice())).forEach(System.out::println);

        // Объявляем список: Кол-во в наличии на складе
        System.out.println("\nСписок: КОЛ-ВО В НАЛИЧИИ НА СКЛАДЕ: ");
        catalog.stream().map((product -> product.getQtyInStock())).forEach(System.out::println);

        // Объявляем список: Кол-во заказано
        System.out.println("\nСписок: КОЛ-ВО ЗАКАЗАНО: ");
        catalog.stream().map((product -> product.getQtyOrdered())).forEach(System.out::println);

        System.out.println("\nРЕАЛИЗУЕМ НАВИГАЦИОННОЕ МЕНЮ, СОСОЯЩЕЕ ИЗ РАЗДЕЛОВ:");
        System.out.println("ПОЛНЫЙ КАТАЛОГ:");
        catalog.stream().forEach(System.out::println);
//        catalog.forEach(System.out::println);
        System.out.println();

//        System.out.println("КОРЗИНА:");
//        catalog.stream().filter(element
//                ->element.getPrice() > 29000/* && element.getAvgGrade() < 7.2*/)
//                .toList().forEach(System.out::println);

        System.out.println("КОРЗИНА:");
        catalog.stream().filter(element
                -> Objects.equals(element.getName(), "Samsung Galaxy S100")
                /* && element.getAvgGrade() < 7.2*/)
                .toList().forEach(System.out::println);  // todo

        catalog.stream().filter(element
                                -> Objects.equals(element.getName(), "Samsung Galaxy S100")
                        /* && element.getAvgGrade() < 7.2*/);  // todo


    }
}

class Products {
    private String name;
    private int price;
    private int qtyInStock;
    private int qtyOrdered;

    public Products(String name, int price, int qtyInStock, int qtyOrdered) {
        this.setName(name);
        this.setPrice(price);
        this.setQtyInStock(qtyInStock);
        this.setQtyOrdered(qtyOrdered);
    }

    @Override
    public String toString() {
        return "Наименование: '" + getName() + '\'' +
                ", Цена: " + getPrice() +
                ", Кол-во в наличии на складе: " + getQtyInStock() +
                ", Кол-во заказано: " + getQtyOrdered();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
}