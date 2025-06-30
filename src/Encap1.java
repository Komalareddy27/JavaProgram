class person{
    private  String name="komala";
    private int age=21;

    String getName()
    {
        return name;
    }
    int getage()
    {
        return age;
    }

}


public class Encap1 {

    public static void main(String[] args) {

person p=new person();
        System.out.println(p.getage());
        System.out.println(p.getName());
    }
}
