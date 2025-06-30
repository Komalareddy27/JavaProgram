import java.io.FileInputStream;

public class FileRead2 {
    public static void main(String[] args) {
        String a = "image1/img1.jpg";// mention folder image1
        try (FileInputStream stream = new FileInputStream(a)) {
            int character;
            while ((character = stream.read()) != -1) {
                System.out.println(character);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
