class Toyota{
    String name;
    String model;
    String colour;
    Double price;
    Toyota(String name, String model,String colour, Double price)
    {
        this.name=name;
        this.model=model;
        this.colour=colour;
        this.price=price;

    }
//    Toyota(String name, String model,String colour)
//    {
//        this.name=name;
//        this.model=model;
//        this.colour=colour;
//
//    }

    public void cardetails()
    {
        System.out.println("car name:"+name);
        System.out.println("car model:"+model);
        System.out.println("car colour:"+colour);
        System.out.println("car price:"+price);
        System.out.println("______________________________________");
    }
}
public class Car {
    public static void main(String[] args) {
        Toyota t=new Toyota("Innova","Crysta ", "white", 150000.0);
        Toyota t1=new Toyota("Fortuner", "Lengender", "black",null);
        t.cardetails();
        t1.cardetails();
        
    }
}