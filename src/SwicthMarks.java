import java.util.Scanner;

public class SwicthMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  marks");
        int marks=sc.nextInt();
        int grade=marks/10;

        switch (grade)
        {
            case 10:
                System.out.println("A+");break;
            case 9:
                System.out.println("A");break;
            case 8:
                System.out.println("A");break;
            case 7:
                System.out.println("B+");break;
            case 6:
                System.out.println("B");break;
            case 5:
                System.out.println("C+");break;
            case 4:
                System.out.println("C");break;
            case 3:
                System.out.println("fail");
            default:
                System.out.println("enter valid marks");
                break;
        }

            }
}
