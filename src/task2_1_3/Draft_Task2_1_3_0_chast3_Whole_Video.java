package task2_1_3;

import task2_1_3.utils2_1_3_1.ImageUtils;
import task2_1_3.utils2_1_3_1.RgbMaster;

import java.awt.image.BufferedImage;

public class Draft_Task2_1_3_0_chast3_Whole_Video {
    public static void main(String[] args) throws Exception {
        final BufferedImage image = ImageUtils.getImage("2_1_3_0images/crab.png");
        final RgbMaster rgbMaster = new RgbMaster(image);
        rgbMaster.changeImage(FilterOperation::/*greyScale *//**//**//**//*onlyRed*//**//* onlyGreen *//*
                onlyBlue */sepia);
        ImageUtils.saveImage(rgbMaster.getImage(), "2_1_3_0images/cloned_crab.png");

    }
}


//        final int height = image.getHeight();
//        final int width = image.getWidth();
////        image.getAlphaRaster() != null;
//        final int[] rgbArray = image.getRGB(0, 0, width, height, null, 0, height*width);
//        // (int startX, int startY, int w, int h,
//        //                        int[] rgbArray, int offset, int scansize)
