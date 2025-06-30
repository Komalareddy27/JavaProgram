import java.util.Scanner;

public class Interv23TwoDarray3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
        int transpose[][]=new int[col][row];
        System.out.println("enter the array elements for matrix ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("transpose matrix is ");
        for(int i=0;i<col;i++)
        {
            for (int j=0;j<row;j++)
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println( );
        }

    }
}
