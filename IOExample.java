import java.io.File;
import java.io.IOException;

public class IOExample {
    public static void main(String[] args) throws IOException {

        File file = new File("example.txt");

        if (file.createNewFile()) {
            System.out.println("File created successfully.");
        } else {
            System.out.println("File already exists.");
        }

        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getAbsolutePath());
    }
}
