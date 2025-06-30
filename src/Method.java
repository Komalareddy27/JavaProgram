import java.util.Scanner;

class Details {
    public void person(String name, int age) {
        System.out.println("My name is " + name + " and age is " + age);
    }

    public void dog(String dname, String colour) {
        System.out.println("Dog name is " + dname + " and colour is " + colour);
    }
}

public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name and age:");
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the dog name and colour:");
        String dname = sc.nextLine();
        String colour = sc.nextLine();

        Details obj1 = new Details();
        obj1.person("komala", 21);
        obj1.dog("charlie", "blue");
    }
}
