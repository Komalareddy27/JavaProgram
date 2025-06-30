public class StringReverse {
    public static void main(String[] args) {
        String n = "komala";
        int i;
        String rev = " ";
        for (i = n.length() - 1; i >= 0; i--) {
            rev += n.charAt(i);

        }
        System.out.println(rev);
    }

}