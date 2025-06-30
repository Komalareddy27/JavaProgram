import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileRead3 {
    public static void main(String[] args) {
        String a = "ammu.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(a));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
