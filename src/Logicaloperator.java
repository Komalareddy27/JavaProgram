import java.util.Scanner;

public class Logicaloperator {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the num1");
            int a=sc.nextInt();
            System.out.println("enter the num2");
            int b=sc.nextInt();
            System.out.println((a>b)&&(a==2));
            System.out.println((a<b)||(a<2));
            System.out.println(!((a!=b)&&(a==3)));



        }
    }

