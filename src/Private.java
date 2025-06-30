class PrivateExample{

    private void example()
    {
        System.out.println("hi");
    }
    public void display()
    {
        example();
    }




}

public class Private {
    public static void main(String[] args)
    {
        PrivateExample p= new PrivateExample();
//        p.example();

        p.display();

    }
}
