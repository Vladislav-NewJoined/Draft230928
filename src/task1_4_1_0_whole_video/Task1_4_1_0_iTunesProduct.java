package task1_4_1_0_whole_video;

public class Task1_4_1_0_iTunesProduct {
    String artistName;
    String trackName;
    String collectionName;
    String previewUrl;
    String country;
    String releaseDate;


    void printIntroducePreview() {
        System.out.println(this.artistName + " - " + this.collectionName);
        System.out.println("url to preview: " + " - " + this.previewUrl);
    }

    void printReleaseDate() {
        System.out.println(collectionName + " has released " + this.releaseDate);
    }

}
