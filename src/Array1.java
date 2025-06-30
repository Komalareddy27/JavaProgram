
public class Array1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        char my_name[] = {'k', 'o', 'm', 'a', 'l', 'a'};
        a[2] = 20;
        my_name[5]='M';
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < my_name.length; i++) {
            System.out.print(my_name[i]);
        }

    }
}
