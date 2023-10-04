package utils2_1_3_1;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageUtils {
    static public BufferedImage getImage(String path) throws IOException {
        final File file = new File(path);
        ImageIO.read(file);
//        return null; // TODO: 04.10.2023 в оригинале не было
        return ImageIO.read(file);
    }

    static public void saveImage(BufferedImage image, String path) throws IOException {
//        ImageIO.write(image, "png", new File(path));
        ImageIO.write(image, "png", new File(path));
    }
}
