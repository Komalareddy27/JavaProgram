import java.io.FileOutputStream;

public class Fileio2 {
    public static void main(String[] args) {

        try( FileOutputStream fos=new FileOutputStream(""))
        {
            System.out.println("file is created");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
