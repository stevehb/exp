import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageCropper {

    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("USAGE: 'java ImageCropper <infile> <outfile>'");
            return;
        }

        try {

            BufferedImage image = ImageIO.read(new File(args[0]));
            BufferedImage croppedImage = image.getSubimage(100, 100, 100, 100);
            BufferedImage resizedImage = new BufferedImage(200, 200, croppedImage.getType());
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(croppedImage, 0, 0, 200, 200, null);
            g.dispose();
            ImageIO.write(resizedImage, "png", new File(args[1]));

        } catch(Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
