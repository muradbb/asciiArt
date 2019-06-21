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
    static int getAvgRGB(int p){
        int red = (p>>16) & 0xff;
        int green = (p>>8) & 0xff;
        int blue = p & 0xff;
        return (red+blue+green)/3;
    }



    public static void main(String[] args) {
        loadImage();
        int [][] brightMatrix=new int[img.getWidth()][img.getHeight()];
        int[][][]pixelMatrix = new int[img.getWidth()][img.getHeight()][3];


//        for (int i = 0; i <img.getWidth() ; i++) {
//            for (int j = 0; j < img.getHeight(); j++) {
//                pixelMatrix[i][j]=getSepRGB(img.getRGB(i,j));
//            }
//        }
        for (int i = 0; i <img.getWidth() ; i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                brightMatrix[i][j]=getAvgRGB(img.getRGB(i,j));
                System.out.println(brightMatrix[i][j]);
            }
        }







//        for (int i = 0; i <img.getWidth() ; i++) {
//            for (int j = 0; j < img.getHeight(); j++) {
//                for (int k = 0; k <3 ; k++) {
//                    if(k==2){
//                        System.out.println(pixelMatrix[i][j][2]);
//                    }else {
//                        System.out.print(pixelMatrix[i][j][k]+" ");
//                    }
//
//                }
//            }
//        }







    }
}
