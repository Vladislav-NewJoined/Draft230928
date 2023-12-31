package task1_4_2_0_whole_video;

import java.io.IOException;
import java.util.Arrays;

// проверка: успешно работает! мин 43 01 видеоурок Модуль1 Тема4 Урок 2. Конструкторы
// прервался на мин 44 01 видеоурок Модуль1 Тема4 Урок 2. Конструкторы
public class Task1_4_2_0_MyClass28_copy4_RandomFilm {
    // 1. Конструктор - это просто метод, разница в том, что вызывается он через new <ИмяКласса>(..,)
    //    то есть - то же самое, как если сделать метод init, только чуть короче

    public static void main(String[] args) throws IOException {
        RandomMoviePicker2 moviePicker = new RandomMoviePicker2();
        String[] movies = moviePicker.getRandomMovieNames();
        System.out.println(Arrays.toString(movies));
//        System.out.println(/*Arrays.toString(movies)*/movies);
    }
}

class RandomMoviePicker2 {
    PageDownloader downloader = new PageDownloader();

//    void getRandomMovieNames() {
    String[] getRandomMovieNames() {
        String url = "https://randommer.io/random-movies";
        String page = downloader.downloadWebPage(url);

        String[] movies = new String[5];
        for (int i=0; i<5; i++) {
            int captionIndex = page.indexOf("<div class=\"caption\"");
            int startIndex = captionIndex + 52;
            int endIndex = page.indexOf("</div>", startIndex) - 28;
            String movieName = page.substring(startIndex, endIndex);
            movies[i] = movieName;
//        int pIndex = page.indexOf();
        }
        return movies;
    }
}
