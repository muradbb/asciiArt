import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    static BufferedImage img;

    static void loadImage(){
        try {
            img= ImageIO.read(new File("../res/pineapple.jpg"));

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        loadImage();
        System.out.println(img.getHeight());



    }
}
