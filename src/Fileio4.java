import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fileio4 {
    public static void main(String[] args) {
        String a = "ammu.txt";
        File file = new File(a);

        try {
            FileWriter obj = new FileWriter(file);
            obj.write("hi, how are you feeling \n");
            obj.write("komala");

            System.out.println("data is inserted");
            obj.close(); // always close writer
        } catch (IOException e) {
            System.out.println("Error occurred: " + e);
        }
    }
}
