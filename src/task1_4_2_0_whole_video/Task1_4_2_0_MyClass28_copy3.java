package task1_4_2_0_whole_video;

import java.io.IOException;

// проверка: успешно работает! мин 43 01 видеоурок Модуль1 Тема4 Урок 2. Конструкторы
// прервался на мин 43 01 видеоурок Модуль1 Тема4 Урок 2. Конструкторы
public class Task1_4_2_0_MyClass28_copy3 {
    // 1. Конструктор - это просто метод, разница в том, что вызывается он через new <ИмяКласса>(..,)
    //    то есть - то же самое, как если сделать метод init, только чуть короче

    public static void main(String[] args) throws IOException {
        RandomMoviePicker moviePicker = new RandomMoviePicker();
        moviePicker.getRandomMovieNames();
    }
}

class RandomMoviePicker {
    PageDownloader downloader = new PageDownloader();

    void getRandomMovieNames() {
        String url = "https://randommer.io/random-movies";
        String page = downloader.downloadWebPage(url);
        int captionIndex = page.indexOf("<div class=\"caption\"");
        int startIndex = captionIndex + 52;
        int endIndex = page.indexOf("</div>", startIndex) - 28;
        System.out.println(page.substring(startIndex, endIndex));
//        int pIndex = page.indexOf();
    }
}
