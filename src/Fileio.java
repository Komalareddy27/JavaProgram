import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fileio {
    public static void main(String[] args) throws IOException {
        File file = new File("xyz.txt");
        if (file.createNewFile()) {
            System.out.println("success");
        } else {
            System.out.println("failure");
        }
    }
}
