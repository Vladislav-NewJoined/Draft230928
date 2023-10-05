package utils2_1_3_1;
// лямбда начинается на мин 10 43

import functions.ImageOperation;

import java.awt.image.BufferedImage;

public class RgbMaster_copy3 {

    private BufferedImage image;
    private int width;
    private int height;
    private boolean hasAlphaChannel;
    private int[] pixels;

    public RgbMaster_copy3(BufferedImage image) {
        this.image = image;
        width = image.getWidth();
        height = image.getHeight();
        hasAlphaChannel = image.getAlphaRaster() != null;
        pixels = image.getRGB(0, 0, width, height, null, 0, height*width);
    }

    public BufferedImage getImage() {
        return image;
    }

    public void changeImage(ImageOperation operation) throws Exception {
        for (int i = 0; i < pixels.length; i++) {
            float[] pixel = ImageUtils.rgbIntToArray(pixels[i]);
            float[] newPixel = operation.execute(pixel);
            pixels[i] = ImageUtils.arrayToRgbInt(newPixel);
        }
        final int type = hasAlphaChannel ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_BGR;
        image = new BufferedImage(width, height, type);
    }

}
