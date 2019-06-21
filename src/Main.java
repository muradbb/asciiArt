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
    static int[] getSepRGB(int p){
        int red = (p>>16) & 0xff;
        int green = (p>>8) & 0xff;
        int blue = p & 0xff;
        int[] a= {red,blue,green};
        return a;
    }



    public static void main(String[] args) {
        loadImage();

        int[][][]pixelMatrix = new int[img.getHeight()][img.getWidth()][3];
        for (int i = 0; i <img.getHeight() ; i++) {
            for (int j = 0; j < img.getWidth(); j++) {
                pixelMatrix[i][j]=getSepRGB(img.getRGB(j,i));
            }
        }
        for (int i = 0; i <img.getHeight() ; i++) {
            for (int j = 0; j < img.getWidth(); j++) {
                for (int k = 0; k <3 ; k++) {
                    if(k==2){
                        System.out.println(pixelMatrix[i][j][2]);
                    }else {
                        System.out.print(pixelMatrix[i][j][k]+" ");
                    }

                }
            }
        }






    }
}
