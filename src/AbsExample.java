abstract class hi{
    abstract void hello();

}
class hello extends hi{
    void hello(){
        System.out.println("welcome");
    }
}
public class AbsExample {
    public static void main(String[] args) {
        hello h=new hello();
        h.hello();
    }
}
