package DeepLearningJava.src.Aiproject;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        runTests();
    }

    private static void runTests() {
        ImageLoader imageLoader = new ImageLoader();

        String imagePath = "C:\\Users\\Weiya\\OneDrive\\Desktop\\JavaDeepLearningRepo\\DeepLearningJava\\Data\\seven.png";
        BufferedImage image = imageLoader.loadImage(imagePath);
        
        if (image != null) {
            System.out.println("Test Passed: Image loaded successfully.");
        } else {
            System.out.println("Test Failed: Image could not be loaded.");
        }
    }
}