package task2_1_3_1_StreamAPI;

import task2_1_3_1_StreamAPI.utils2_1_3_1.ImageUtils;
import task2_1_3_1_StreamAPI.utils2_1_3_1.RgbMaster;

import java.awt.image.BufferedImage;

public class Draft_Task2_1_3_0_chast2_Whole_Video {
    public static void main(String[] args) throws Exception {
        final BufferedImage image = ImageUtils.getImage("2_1_3_0images/crab.png");
        final RgbMaster rgbMaster = new RgbMaster(image);
        rgbMaster.changeImage((float[] rgb) -> {
            final float mean = (rgb[0]+rgb[1]+rgb[2])/3;
            rgb[0] = mean;
            rgb[1] = mean;
            rgb[2] = mean;
            return rgb;
        });
        ImageUtils.saveImage(rgbMaster.getImage(), "2_1_3_0images/cloned_crab.png");

    }
}


//        final int height = image.getHeight();
//        final int width = image.getWidth();
////        image.getAlphaRaster() != null;
//        final int[] rgbArray = image.getRGB(0, 0, width, height, null, 0, height*width);
//        // (int startX, int startY, int w, int h,
//        //                        int[] rgbArray, int offset, int scansize)
