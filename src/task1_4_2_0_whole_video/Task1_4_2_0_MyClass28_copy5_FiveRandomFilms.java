package task1_4_2_0_whole_video;

import java.io.IOException;
import java.util.Arrays;

// проверка: успешно работает! мин 45 40 видеоурок Модуль1 Тема4 Урок 2. Конструкторы
// прервался на мин 45 40 видеоурок Модуль1 Тема4 Урок 2. Конструкторы

// DONE!
public class Task1_4_2_0_MyClass28_copy5_FiveRandomFilms {
    // 1. Конструктор - это просто метод, разница в том, что вызывается он через new <ИмяКласса>(..,)
    //    то есть - то же самое, как если сделать метод init, только чуть короче

    public static void main(String[] args) throws IOException {
        RandomMoviePicker3 moviePicker = new RandomMoviePicker3();
        String[] movies = moviePicker.getRandomMovieNames();
        System.out.println(Arrays.toString(movies));
//        System.out.println(/*Arrays.toString(movies)*/movies);
    }
}

class RandomMoviePicker3 {
    PageDownloader downloader = new PageDownloader();

//    void getRandomMovieNames() {
    String[] getRandomMovieNames() {
        String url = "https://randommer.io/random-movies";
        String page = downloader.downloadWebPage(url);

        String[] movies = new String[5];
        int endIndex = 0;
        for (int i=0; i<5; i++) {
            int captionIndex = page.indexOf("<div class=\"caption\"", endIndex);
            int startIndex = captionIndex + 52;
            endIndex = page.indexOf("</div>", startIndex) - 28;
            String movieName = page.substring(startIndex, endIndex);
            movies[i] = movieName;
        }
        return movies;
    }
}
