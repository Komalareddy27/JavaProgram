class College {
    String cname;
    String address;

    College(String cname, String address) {
        this.cname = cname;
        this.address = address;
    }

    void display1() {
        System.out.println("My College name: " + cname + " and located at " + address);
    }
}

class Dept extends College {
    String dname;
    String tname;

    Dept(String cname, String address, String dname, String tname) {
        super(cname, address);
        this.dname = dname;
        this.tname = tname;
    }

    void display2() {
        super.display1();
        System.out.println("Department name is: " + dname + ", Teacher name: " + tname);
    }
}

class Students extends College {
    String sname;
    String sroll;

    Students(String cname, String address, String sname, String sroll) {
        super(cname, address);
        this.sname = sname;
        this.sroll = sroll;
    }

    void display3() {
        super.display1();
        System.out.println("Student name: " + sname + ", Roll no: " + sroll);
    }
}

public class Practise1 {
    public static void main(String[] args) {
        Students s = new Students("VVIT", "Bangalore", "Komala", "1vj21cs020");
        s.display3();
    }
}
