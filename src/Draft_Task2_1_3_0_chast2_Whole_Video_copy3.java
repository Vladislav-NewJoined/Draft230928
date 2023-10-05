import utils2_1_3_1.ImageUtils;
import utils2_1_3_1.RgbMaster_copy2;

import java.awt.image.BufferedImage;

public class Draft_Task2_1_3_0_chast2_Whole_Video_copy3 {
    public static void main(String[] args) throws Exception {
        final BufferedImage image = ImageUtils.getImage("images2_1_3_1/crab.png");
        final RgbMaster_copy2 rgbMaster = new RgbMaster_copy2(image);
        rgbMaster.changeImage((float[] rgb) -> {
            rgb[0] = rgb[0] / 2;
            rgb[1] = rgb[1] / 2;
            rgb[2] = rgb[2] / 2;
            return rgb;
        });
        ImageUtils.saveImage(rgbMaster.getImage(), "images2_1_3_1/cloned_crab.png");
//        final int height = image.getHeight();
//        final int width = image.getWidth();
////        image.getAlphaRaster() != null;
//        final int[] rgbArray = image.getRGB(0, 0, width, height, null, 0, height*width);
//        // (int startX, int startY, int w, int h,
//        //                        int[] rgbArray, int offset, int scansize)
    }
}
