package task1_4_1_0_whole_video;

// источник: iTunes Search API Constructings Searches - контекст для поиска
// источник: https://developer.apple.com/library/archive/documentation/AudioVideo/Conceptual/iTuneSearchAPI/SearchExamples.html#//apple_ref/doc/uid/TP40017632-CH6-SW1
// источник: вот этот пример скачали:  https://itunes.apple.com/search?term=jack+johnson&limit=25
// источник: далее сюда возвращаемый ответ вставили: https://codebeautify.org/jsonviewer (приложен файл 1.txt)

// прервался на мин 12 34
// мин 14 56 это наследование
// домашку начинать делать с мин 18 54

public class Task1_4_1_0_Whole_video {
    public static void main(String[] args) {
//        Task1_4_1_1_iTunesSong song = new Task1_4_1_1_iTunesSong();
//        song.trackName = "Billie Jean";
//        song.trackCensoredName = "***** ***";
//        song.artistName = "Michael Jackson";
//        song.previewUrl = "http://itunes.com/billiejean.mp3";
//        song.collectionName = "Best of MJ";
//        song.printIntroducePreview();
//        song.releaseDate = "2020";

        Task1_4_1_0_iTunesMovie movie = new Task1_4_1_0_iTunesMovie();
        movie.shortDescription = "the best movie ever";
        movie.artistName = "Brad Pitt";
        movie.previewUrl = "http://itunes.com/bradpitt.mp4";
        movie.collectionName = "Best of BP";
        movie.printIntroducePreview();
        movie.releaseDate = "2022";

//        song.printReleaseDate();
//        movie.printReleaseDate();

        Task1_4_1_0_iTunesComedyMovie comedy = new Task1_4_1_0_iTunesComedyMovie();
        comedy.shortDescription = "the best comedy ever";
        comedy.artistName = "Jim Carry";
        comedy.previewUrl = "http://itunes.com/carry.mp4";
        comedy.collectionName = "Best of JC";
        comedy.printIntroducePreview();
        comedy.releaseDate = "2019";
        comedy.comedyGenre = "trash";
        comedy.rating = 10;

//        Task1_4_1_1_iTunesAudiobook book = new Task1_4_1_1_iTunesAudiobook();
//        book.artistName;

    }
}
