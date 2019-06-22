import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    static BufferedImage img;
    static String ascii="`^',:;Il!i~+_-?][}{1)(|/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";



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

    static char mkArt(int a){
        return ascii.charAt(a/4);
    }



    public static void main(String[] args) {
        loadImage();
        int [][] brightMatrix=new int[img.getWidth()][img.getHeight()];
        int[][][]pixelMatrix = new int[img.getWidth()][img.getHeight()][3];
        char[][] charMatrix=new char[img.getWidth()][img.getHeight()];


//        for (int i = 0; i <img.getWidth() ; i++) {
//            for (int j = 0; j < img.getHeight(); j++) {
//                pixelMatrix[i][j]=getSepRGB(img.getRGB(i,j));
//            }
//        }
        for (int i = 0; i <img.getWidth() ; i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                brightMatrix[i][j]=getAvgRGB(img.getRGB(i,j));
                charMatrix[i][j]=mkArt(brightMatrix[i][j]);
            }
        }

        for (int i = 0; i <img.getWidth() ; i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                if(j==(img.getHeight()-1)){
                    System.out.println(charMatrix[i][j]);
                }else {
                System.out.print(charMatrix[i][j]);
                }
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
