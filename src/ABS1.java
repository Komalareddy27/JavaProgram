abstract class Basic{
    abstract  void eat();

}
class Dog extends Basic{
    void eat()
    {
        System.out.println("dog eats");
    }
}
public class ABS1 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();

    }
}
