package task2_1_3_1_StreamAPI;

import task2_1_3_1_StreamAPI.utils2_1_3_1.ImageUtils;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Draft_Task2_1_3_0_chast1_Whole_Video {
    public static void main(String[] args) throws IOException {
        final BufferedImage image = ImageUtils.getImage("2_1_3_0images/crab.png");
        ImageUtils.saveImage(image, "2_1_3_0images/cloned_crab.png");
        final int height = image.getHeight();
        final int width = image.getWidth();
//        image.getAlphaRaster() != null;
//        final int[] rgbArray = image.getRGB(0, 0, width, height, null, 0, height*width);
        // (int startX, int startY, int w, int h,
        //                        int[] rgbArray, int offset, int scansize)
    }
}
