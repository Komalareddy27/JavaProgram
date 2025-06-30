import java.io.FileReader;

public class FileRead1 {
    public static void main(String[] args) {
        String a = "ammu.txt";
        try (FileReader reader = new FileReader(a)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
