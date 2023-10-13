package Task2_1_19_1;

import task2_1_2_1_copy2_ObrabotkaFoto.utils2_1_3_1.ImageUtils;
import task2_1_2_1_copy2_ObrabotkaFoto.utils2_1_3_1.RgbMaster;
import task2_1_3_1_StreamAPI.FilterOperation;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Task2_1_19_1 {
    public static void main(String[] args) throws Exception {
        final BufferedImage image = ImageUtils.getImage("src/Task2_1_19_1/images/Picture_Mountain_Lake.png");

        // Способ 1, с фильтром: Такая же картинка.
        ImageUtils.saveImage(image, "src/Task2_1_19_1/images/cloned_Picture_Mountain_Lake1.png");
        final int height = image.getHeight();
        final int width = image.getWidth();
//        image.getAlphaRaster() != null;
//        final int[] rgbArray = image.getRGB(0, 0, width, height, null, 0, height*width);
        // (int startX, int startY, int w, int h,
        //                        int[] rgbArray, int offset, int scansize)
        System.out.println("Выполнен Способ 1, с фильтром: Такая же картинка");
        // Способ 1, с фильтром: Такая же картинка. Конец


        // Способ 2, с фильтром: Монохромный.
        final RgbMaster rgbMaster = new RgbMaster(image);
        rgbMaster.changeImage((float[] rgb) -> {
            final float mean = (rgb[0]+rgb[1]+rgb[2])/3;
            rgb[0] = mean;
            rgb[1] = mean;
            rgb[2] = mean;
            return rgb;
        });
        ImageUtils.saveImage(rgbMaster.getImage(), "src/Task2_1_19_1/images/cloned_Picture_Mountain_Lake2.png");
        System.out.println("Выполнен Способ 2, с фильтром: Монохромный.");
        // Способ 2, с фильтром: Монохромный. Конец


        // Способ 6, с фильтром: Сепия.
        final RgbMaster rgbMaster6 = new RgbMaster(image);
        rgbMaster6.changeImage(FilterOperation::/*greyScale *//**//**//**//*onlyRed*//**//* onlyGreen *//*
                onlyBlue */sepia);
        ImageUtils.saveImage(rgbMaster6.getImage(), "src/Task2_1_19_1/images/cloned_Picture_Mountain_Lake6.png");
        System.out.println("Выполнен Способ 6, с фильтром: Сепия.");
        // Способ 6, с фильтром: Сепия. Конец


    }
}
