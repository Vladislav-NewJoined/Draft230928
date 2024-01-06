package task1_4_2_0_whole_video;

import java.io.IOException;

// проверка: успешно работает! мин 48 15 видеоурок Модуль1 Тема4 Урок 2. Конструкторы
// прервался на мин 48 15 видеоурок Модуль1 Тема4 Урок 2. Конструкторы

// DONE!
public class Task1_4_2_0_MyClass28_copy6_FirstRandomFilm {
    // 1. Конструктор - это просто метод, разница в том, что вызывается он через new <ИмяКласса>(..,)
    //    то есть - то же самое, как если сделать метод init, только чуть короче

    public static void main(String[] args) throws IOException {
        RandomMoviePicker4 moviePicker = new RandomMoviePicker4();
        String[] movies = moviePicker.getRandomMovieNames();
//        System.out.println(Arrays.toString(movies));
//        System.out.println(/*Arrays.toString(movies)*/movies);
        ITunesMoviePlayer player = new ITunesMoviePlayer();
        player.playMovie(movies[0]);
    }
}

class RandomMoviePicker4 {
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
            String nameWithoutYear = movieName.substring(0, movieName.length() - 6);
            movies[i] = nameWithoutYear;
        }
        return movies;
    }
}
