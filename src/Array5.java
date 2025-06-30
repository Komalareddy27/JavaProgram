import java.util.Scanner;
// odd count even count
// do palindrome by reversing for loop

public class Array5 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    int array[] = new int[n];
    int even=0,odd=0;

        for (int i = 0; i < array.length; i++) {
        System.out.print("Enter element " + (i + 1) + ": ");
        array[i] = sc.nextInt();
        if(array[i]%2==0)
        {
            even++;
       }
        else {
            odd++;
        }
    }
        System.out.println("even count="+even);
        System.out.println("odd count="+odd);

}
}
