class Add{
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Add a=new Add();
        a.add(1,2);

        a.add(1,2,-9)  ;
    }
}
