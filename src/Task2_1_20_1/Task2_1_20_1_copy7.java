package Task2_1_20_1;

import java.util.ArrayList;
import java.util.List;

// источник: https://www.youtube.com/playlist?list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs  - Заур Трегулов
public class Task2_1_20_1_copy7 {
}

// Streams. Метод filter (прокачанная Java)  https://youtu.be/C7uDcRGiwg8
// Метод filter: мин 1 25
class Test3 {
    public static void main(String[] args) {
        Product5 prod1 = new Product5("Nokia 3310", 12345, 4);
        Product5 prod2 = new Product5("Samsung Galaxy S100", 30000, 7);
        Product5 prod3 = new Product5("IPhone 20", 392049, 1);
        Product5 prod4 = new Product5("Google Pixel 10a", 30000, 4);
        List<Product5> catalog = new ArrayList<>();
        catalog.add(prod1);
        catalog.add(prod2);
        catalog.add(prod3);
        catalog.add(prod4);


        catalog.stream().forEach(System.out::println);
        System.out.println();

        catalog.stream().filter(element
                ->element.getPrice() > 29000/* && element.getAvgGrade() < 7.2*/)
                .toList().forEach(System.out::println);
    }
}

class Product5 {
    private String name;
    private int price;
    private int qtyInStock;

    public Product5(String name, int price, int qtyInStock) {
        this.setName(name);
        this.setPrice(price);
        this.setQtyInStock(qtyInStock);
    }

    @Override
    public String toString() {
        return "Наименование: '" + getName() + '\'' +
                ", Цена: " + getPrice() +
                ", Кол-во в наличии на складе: " + getQtyInStock();
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
}
