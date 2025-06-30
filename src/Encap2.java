class person1{
    private String n;
    private int a;
    public  void setname(String n)
    {
        this.n=n;
    }
    public void setage(int a)
    {
        this.a=a;
    }

}

public class Encap2 {
    public static void main(String[] args) {
        person1 k=new person1();
        k.setage(1);
        k.setname("komala");

    }
}
