import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");

        if (sc.hasNextInt()) {
            int day = sc.nextInt();
            switch (day) {
                case 1:
                    System.out.println("mon"); break;
                case 2:
                    System.out.println("tue"); break;
                case 3:
                    System.out.println("wed"); break;
                case 4:
                    System.out.println("thu"); break;
                case 5:
                    System.out.println("fri"); break;
                case 6:
                    System.out.println("sat"); break;
                case 7:
                    System.out.println("sun"); break;
                default:
                    System.out.println("Enter a valid number between 1 and 7.");
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }

        sc.close(); // Always a good practice to close the Scanner
    }
}
