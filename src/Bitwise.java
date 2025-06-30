import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1");
        int a = 7;
        System.out.println("enter the num2");
        int b = 2;
        System.out.println(+(a & b));
        System.out.println(+(a | b));
        System.out.println(+(~a));
        System.out.println(+(~b));

        System.out.println(+(b << 3));
        System.out.println(+(a >>1));
        System.out.println(+(a<<3
        ));


    }
}
