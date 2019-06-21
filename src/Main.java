import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

public class Main {

    public static void main(String[] args) {

        MarvinImage image= MarvinImageIO.loadImage("../res/pineapple.jpg");
        int imgHeight=image.getHeight();
        int imgWidth=image.getWidth();
        System.out.println("The image size is: "+imgHeight+" x "+imgWidth);


    }
}
