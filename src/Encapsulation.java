class pen{
    private  String colour;
    private int cost;

    String getColour()
    {
        return  this.colour;
    }
    int getCost()
    {
        return this.cost;
    }
    void setColour(String colour)
    {
        this.colour=colour;
    }
    void setCost(int cost)
    {
        this.cost=cost;
    }

}


public class Encapsulation {
    public static void main(String[] args) {
        pen p=new pen();
        p.setColour("blue");
        System.out.println(p.getColour());
        p.setCost(10);
        System.out.println(p.getCost());

    }
}
