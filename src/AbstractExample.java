abstract  class Living{
    abstract void walk();
        }
        class Cat{

            void walk(){
                System.out.println("cat can walk");
            }
        }
public class AbstractExample {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.walk();
    }
}
