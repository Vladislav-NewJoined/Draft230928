//package task1_4_2_0_whole_video;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import static javax.swing.text.html.HTML.getTag;
//
//public class ITunesMoviePlayer-staryi {
////    void playMovie (String searchRequest) throws IOException {
////        playSongInternal(searchRequest, 1);
////    }
////
//// //    void playSong (String searchRequest, int limit) throws IOException {
//// //        playSongInternal(searchRequest, limit);
//// //    }
//
//    void playMovie(String searchRequest) {
//        String url = buildUrl(searchRequest);
//        String page = downLoadWebPage(url);
//
//        String artistName = getTag(page, "artistName");
//        String trackName = getTag(page, "trackName");
//        String previewUrl = getTag(page, "previewUrl");
//        try(InputStream in = new URL(previewUrl).openStream()) {
//
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//
//
//
//
//    private String getTag(String page, String artistName) {
//        return page;
//    }
//
//
//    private String downLoadWebPage(String url) {
//        return null;
//    }
//
//    private String buildUrl(String searchRequest, int limit) {
//        return searchRequest;
//    }
//}
