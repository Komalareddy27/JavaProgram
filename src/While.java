import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit of Fibonacci numbers: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + n + ":");

        while (a <= n) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
