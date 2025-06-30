class Examples{
    String name;
    int age;
    Examples(String n, int ag)
    {
        name=n;
        age=ag;
    }
    public  void details()
    {
        System.out.println("name is "+name+  " " +"and age is"+ " " +age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Examples e= new Examples("komala", 20);
        e.details();
    }

}
