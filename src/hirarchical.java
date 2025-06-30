class animals
{
    void demo()
    {
        System.out.println(" parent class");
    }
}
class cat extends animals{
    void demo1()
    {
        System.out.println(" child class 1");
    }
}
class horse extends animals{
    void demo2()
    {
        System.out.println(" child class 2");
    }

}
public class hirarchical {

    public static void main(String[] args) {
        cat d=new cat();
        d.demo1();
        horse h=new horse();
        h.demo2();


    }
}
