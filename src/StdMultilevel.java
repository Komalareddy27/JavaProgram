class animal
{
    String colour;
    String type;
    animal(String colour,String type)
    {
        this.colour=colour;
        this.type=type;
    }
    void animaldetails()
    {
        System.out.println(" colour="+colour+ " "+ "type="+ " "+type);
    }
}
class  dog extends animal{
    String name;
    dog(String colour,String type,String name)
    {
        super(colour,type);
        this.name=name;
    }
    void dogdeatils()
    {
        System.out.println(" colour="+colour+ " "+ "type="+ " "+type+" "+"name="+name);
    }
}
class puppy extends  dog{
    String gender;
    puppy (String colour,String type,String name,String gender)
    {
        super(colour,type,name);
        this.gender=gender;
    }
    void pupppydetails()
    {
        System.out.println(" colour="+colour+" "+ "type="+ " "+type+" "+"name="+name+" "+"gender="+gender);

    }
}

public class StdMultilevel {
    public static void main(String[] args) {
        puppy p=new puppy("green","nayi","bunty","female");
        animal a=new animal("white","golden river");
        dog d=new dog("black","tiger","chimtu");
        p.animaldetails();
        p.dogdeatils();
        p.pupppydetails();
        d.animaldetails();



    }
}
