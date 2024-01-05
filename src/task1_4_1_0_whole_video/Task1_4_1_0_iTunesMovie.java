package task1_4_1_0_whole_video;

public class Task1_4_1_0_iTunesMovie extends Task1_4_1_0_iTunesProduct {

    // common
    String artistName;
    String collectionName;
    String previewUrl;
    String country;
    void printIntroducePreview() {
        System.out.println(this.artistName + " - " + this.collectionName);
        System.out.println("url to preview: " + " - " + this.previewUrl);
    }
    // /common

    String trackName;
    //    double trackPrice;
    String trackPrice;
    double trackHdPrice;
    //    double collectionPrice;
    String collectionPrice;
    String shortDescription;
    String longDescription;

}
