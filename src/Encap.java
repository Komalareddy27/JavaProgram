class Studeat
{
    public void print()
    {
        System.out.println("aa");
    }

}
class EmpDeatils extends Studeat{

    public void print()
    {
        System.out.println("bb");
    }
}


public class Encap {
    public static void main(String[] args) {
Studeat s=new Studeat();
s.print();
EmpDeatils e=new EmpDeatils();
e.print();

    }
}
