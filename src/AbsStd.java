abstract  class EmpDetails{

    abstract void  empdetail(String name, int sal);
    abstract  void deptdetails(String dptname, int dptid);
    void company(String cname)
    {
        System.out.println("Company Name:"+ " "+cname);
    }
}
class Alldetails extends  EmpDetails{

    void  empdetail(String name, int sal){
        System.out.println("Employee name:"+name+ " " + " " + "Salary:" +sal);
    }
    void deptdetails(String dptname, int dptid)
    {
        System.out.println("Department name:"+dptname +" " + " " + " Department Id:"+ " "+dptid);
    }

}

public class AbsStd {
    public static void main(String[] args) {
        Alldetails a=new Alldetails();
        a.empdetail("komala",50000);
        a.deptdetails("cs", 5);
        a.company("TCS");

    }
}
