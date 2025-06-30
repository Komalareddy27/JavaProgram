
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class FileAll4  {
    public static void main(String[] args) {
        String a = "example.txt";
        String content = "Hello, Komala!";

        try {
            FileWriter writer = new FileWriter(a);
            writer.write(content);
            writer.close();
            System.out.println("File created and written successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            List<String> lines = Files.readAllLines(Paths.get(a));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        try {
            Files.deleteIfExists(Paths.get(a));
            System.out.println("File deleted successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
