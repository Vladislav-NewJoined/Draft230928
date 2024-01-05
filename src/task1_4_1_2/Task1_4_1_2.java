package task1_4_1_2;

// источник: iTunes Search API Constructings Searches - контекст для поиска
// источник: https://developer.apple.com/library/archive/documentation/AudioVideo/Conceptual/iTuneSearchAPI/SearchExamples.html#//apple_ref/doc/uid/TP40017632-CH6-SW1
// источник: вот этот пример скачали:  https://itunes.apple.com/search?term=jack+johnson&limit=25
// источник: далее сюда возвращаемый ответ вставили: https://codebeautify.org/jsonviewer (приложен файл 1.txt)

// прервался на мин 12 34
// мин 14 56 это наследование
// домашку начинать делать с мин 18 54

public class Task1_4_1_2 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            Модуль 1. Тема 4. Урок 1. Наследование
                Задание 2. Реализуйте классы с наследованием: пользователь, администратор, модератор\s

            Решение:\s""");

        Task1_4_1_2_SourceData sourceData = new Task1_4_1_2_SourceData();
        sourceData.user = "Ivan - is user";
        sourceData.administrator = "Vasiliy - is administrator";
        sourceData.printSourceFields();

        Task1_4_1_2_Moderator moderator = new Task1_4_1_2_Moderator();
        moderator.moderator = "Mihail - is moderator";
        moderator.printModerator();
    }
}
