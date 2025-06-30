import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a ");
        int a = sc.nextInt();
        System.out.println("enter the  b");
        int b = sc.nextInt();
        System.out.println("enter the  c");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a + " " + "is large");

        } else if (b >= c) {
            System.out.println(b + " " + "is large");
        } else {
            System.out.println(c + " " + "is large");
        }

    }
}
