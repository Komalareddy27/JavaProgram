import java.io.FileOutputStream;

public class fileio5 {
    public static void main(String[] args) {

        String a="ammu.txt";
        String content="\n hello komala";
        try(FileOutputStream fos=new FileOutputStream(a, true))
        {
            byte[] bytes=content.getBytes();
            fos.write(bytes);
            System.out.println("created");
            fos.close();
        }
        catch(Exception e)
        {
            System.out.println("not created");
        }

    }
}
