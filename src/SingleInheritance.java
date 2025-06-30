 class Parent{
    void a()
    {
        System.out.println("parent");
    }
    void c()
    {
        System.out.println("c");
    }
 }
 class child extends Parent
         {
             void a()
             {
                 System.out.println("child");
             }
         }
public class SingleInheritance {
    public static void main(String[] args) {
        child c=new child();

        c.a();

    }
}
