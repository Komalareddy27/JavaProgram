public class AirthmeticexceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);
        }
        catch (Exception e) {
            System.out.println("General Exception: " + e);
        }
        finally {
            System.out.println("Error cleared");
        }
    }

}
