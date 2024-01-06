package task1_4_2_0_whole_video;

import java.io.IOException;

// проверка: успешно работает! мин 28 47 видеоурок Модуль1 Тема4 Урок 2. Конструкторы
// прервался на мин 28 47 видеоурок Модуль1 Тема4 Урок 2. Конструкторы
public class Task1_4_2_0_MyClass28_copy2_FragmentOfFilm {
    // 1. Конструктор - это просто метод, разница в том, что вызывается он через new <ИмяКласса>(..,)
    //    то есть - то же самое, как если сделать метод init, только чуть короче

    public static void main(String[] args) throws IOException {
        ITunesMoviePlayer player = new ITunesMoviePlayer();
        player.playMovie("Terminator");
    }
}
