class  DefaultModifier{
    void display()
    {
        System.out.println("example of default access specifier");
    }

}
public class Default {
    public static void main(String[] args)
    {
        DefaultModifier d=new DefaultModifier();
        d.display();
    }
}
