import java.nio.file.Files;
import java.nio.file.Paths;

public class Fileio6 {
    public static void main(String[] args) {
        try
        {
            String a="ammu.txt";
            String content="Bangalore";
            Files.write(Paths.get(a), content.getBytes());
            System.out.println("data inserted");

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
