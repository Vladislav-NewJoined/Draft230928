package task1_4_1_1;

public class Task1_4_1_1 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            Модуль 1. Тема 4. Урок 1. Наследование
                Задание 1. Реализуйте классы с наследованием: директория, файл\s

            Решение:\s""");

        Task1_4_1_1_DirectoryAndFileExtended data = new Task1_4_1_1_DirectoryAndFileExtended();
//        data.directory = "directory_For_testFile";
        data.directory = "src/task1_4_1_1/directory_For_testFile";
//        data.file = "directory_For_testFile/testFile.txt";
        data.file = "src/task1_4_1_1/directory_For_testFile/testFile.txt";

        data.printDirectory();
        data.printFile();
    }
}
