package task1_4_2_0_whole_video;

import java.io.File;

// 1. Конструктор - это просто метод, разница в том, что вызывается он через new <ИмяКласса>(..,)
//    то есть - то же самое, как если сделать метод init, только чуть короче

// прервался на мин 19 58
// изменение FileInformation на мин 04 24
// "Давайте напишем заново" мин 12 54 ITunesMusicPlayer Модуль1 Тема3 Урок 8. Перегрузка методов
// "Давайте попробуем скачать отрывок фильма" мин 18 49 видеоурок Модуль1 Тема4 Урок 2. Конструкторы
public class Task1_4_2_0_MyClass28 {
    public static void main(String[] args) {
        Printer printer = new Printer("HP", 100);
//        printer.init("HP", 100);
//        printer.price = 100;
//        printer.maker = "HP";

        FileInformation fileInformation = new FileInformation("text.txt", "src\\task1_4_2_0_whole_video", 1000);
//        fileInformation.init("text.txt", "src\\task1_4_2_0_whole_video", 1000);
//        fileInformation.fileName = "text.txt";
//        fileInformation.size = 1000;
//        fileInformation.absolutePath = "src\\task1_4_2_0_whole_video";

//        Cat cat = new Cat();
//        cat.age = 10;
//        cat.name = "Vasya";

        Cat cat = new Cat("Vasya", 10);
//        Cat cat = new Cat();
//        cat.init("Vasya", 10);

        System.out.println(fileInformation.absolutePath);
    }
}

class Printer {
    int price;
    String maker;

//    Printer init (String inputMaker, int inputPrice) {
//   void init(String inputMaker, int inputPrice) {
    Printer(String inputMaker, int inputPrice) {
        this.maker = inputMaker;
        this.price = inputPrice;
//        return new Printer();
    }

    Printer(String inputMaker) {
        this.maker = inputMaker;
    }

    Printer() {
        this.price = 100;
        System.out.println("Set printer price to default");
    }

    void myMethod(){ System.out.println("this is method"); }

    void writePrinterInfo() {
        System.out.println("Im printer");
        System.out.println("My maker is " + this.maker);
        System.out.println("My price is " + this.price);
    }

    void decreasePrice() {
        this.price = this.price - 10;
    }
}

class FileInformation {
    String fileName;
    String absolutePath;
    long size;

//    void init(String inputFileName, String inputAbsolutePath, long inputSize) {
    FileInformation(String inputFileName, String inputAbsolutePath, long inputSize) {
        this.fileName = inputFileName;
        this.absolutePath = inputAbsolutePath;
        this.size = inputSize;
    }

    FileInformation(File inputFile) {
        this.absolutePath = inputFile.getAbsolutePath();
        this.fileName = inputFile.getName();
        this.size = inputFile.length();
    }
}

class Cat {
    String name;
    int age;

//    void init(String name, int age) {
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
