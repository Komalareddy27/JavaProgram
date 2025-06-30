
class Grandfather{
    void display()
    {
        System.out.println("grandpa");
    }
}
class Father extends Grandfather
{
    void display1()
    {
        System.out.println("Father");
    }
}
class Child extends Father
{
    void display3()
    {
        System.out.println("Child");
    }
}

public class Mutilevel {
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
        c.display1();
        c.display3();


    }


}
