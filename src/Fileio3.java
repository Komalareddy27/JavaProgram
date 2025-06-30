import java.io.FileOutputStream;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Fileio3 {
    public static void main(String[] args) {
        try
        {
            Files.write(Paths.get("exampl.txt"), "hi ammu".getBytes());
            System.out.println("file is created");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }


}
