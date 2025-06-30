import java.util.Scanner;

class Operations {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("b value should be greater than zero");
            return 0;
        }
    }

    public int mod(int a, int b) {
        return a % b;
    }
}

public class Calculations {
    public static void main(String[] args) {
        Operations obj = new Operations();

        System.out.println("Addition of 2 numbers is " + obj.add(6, 9));
        System.out.println("Subtraction of 2 numbers is " + obj.sub(6, 9));
        System.out.println("Multiplication of 2 numbers is " + obj.mul(6, 9));
        System.out.println("Division of 2 numbers is " + obj.div(6, 0));
        System.out.println("Modulus of 2 numbers is " + obj.mod(6, 9));
    }
}
