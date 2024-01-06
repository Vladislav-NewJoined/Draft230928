package task1_4_2_0_whole_video;

import java.io.IOException;

// проверка: успешно работает! мин 53 32 видеоурок Модуль1 Тема4 Урок 2. Конструкторы
// прервался на мин 53 32 видеоурок Модуль1 Тема4 Урок 2. Конструкторы

public class Task1_4_2_0_MyClass28_copy7_ChoiceRandomFilm {
    // 1. Конструктор - это просто метод, разница в том, что вызывается он через new <ИмяКласса>(..,)
    //    то есть - то же самое, как если сделать метод init, только чуть короче

    public static void main(String[] args) throws IOException {
        RandomMoviePicker5 moviePicker = new RandomMoviePicker5();
        Movie[] movies = moviePicker.getRandomMovieNames();
        System.out.println("Choose film to watch: ");
//        System.out.println(Arrays.toString(movies));
//        System.out.println(/*Arrays.toString(movies)*/movies);
        for (int i=0; i<movies.length; i++) {
            int number = i+1;
            System.out.println(number + ": " + movies[i].name + " (" + movies[i].year + ")");
        }
//        ITunesMoviePlayer player = new ITunesMoviePlayer();
//        player.playMovie(movies[0]);
    }
}

class RandomMoviePicker5 {
    PageDownloader downloader = new PageDownloader();

//    void getRandomMovieNames() {
    Movie[] getRandomMovieNames() {
        String url = "https://randommer.io/random-movies";
        String page = downloader.downloadWebPage(url);

        Movie[] movies = new Movie[16];
        int endIndex = 0;
        for (int i=0; i<16; i++) {
            int captionIndex = page.indexOf("<div class=\"caption\"", endIndex);
            int startIndex = captionIndex + 52;
            endIndex = page.indexOf("</div>", startIndex) - 28;
            String movieName = page.substring(startIndex, endIndex);
            String nameWithoutYear = movieName.substring(0, movieName.length() - 6);
            String year = movieName.substring(movieName.length()-5, movieName.length()-1);
            movies[i] = new Movie(nameWithoutYear, year);
        }
        return movies;
    }
}

class Movie {
    String name;
    String year;

    Movie(String inputName, String inputYear) {
        this.name = inputName;
        this.year = inputYear;
    }
}