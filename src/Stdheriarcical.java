
class fruit{
    String season;
    fruit(String season)
    {
        this.season=season;
    }
    void display1()
    {
        System.out.println("apple="+season);
    }
}
class apple extends  fruit{
    int price;
    apple(String season,int price)
    {
        super(season);
        this.price=price;
    }
    void display2()
    {
        super.display1();
        System.out.println("price ="+price);
    }
}
class banana extends fruit
{
    String colour;
    banana(String season,String colour)
    {
        super(season);
        this.colour=colour;

    }
    void display3()
    {
        super.display1();
        System.out.println(" colour is"+colour);
    }
}
public class Stdheriarcical {
    public static void main(String[] args) {
        fruit f=new fruit("winter");
        f.display1();
        apple a=new apple("winter", 100);
        a.display1();
        a.display2();
        banana b= new banana("summer", "red");
        b.display1();
        b.display3();


    }
}

