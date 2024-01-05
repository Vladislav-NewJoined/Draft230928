package task1_4_2_0_whole_video;

import java.io.IOException;
import java.util.Scanner;

public class Task1_4_2_0_MyClass24 {
    public static void main(String[] args) throws IOException {
        ITunesMusicPlayer player = new ITunesMusicPlayer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which song you are looking for?");
        String name = scanner.nextLine();
//        player.playSong("we will rock");
//        player.playSong(name);
        player.playSong("love", 100);
        // или можно так:
//        player.playSong("term"); // todo : Можно удалить
    }
}
