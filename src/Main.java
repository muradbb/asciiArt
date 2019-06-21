import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class Main {

    public static void main(String[] args) {
        System.load("C:/Users/murad/Desktop/New folder (2)/opencv/build/java/x64/opencv_java410.dll");

        Mat img = Imgcodecs.imread("../res/pineapple.jpg");
        System.out.println("Image size is: "+img.width()+" x "+img.height());



    }
}
