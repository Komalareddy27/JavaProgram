import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");

        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("array elements are ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
