class Employee{
    String name;
    String role;
    double salary;
    Employee(String n, String r, double s)
    {
        name=n;
        role=r;
        salary=s;
    }
    public void details()
    {
        System.out.println("Employee name is "+name);
        System.out.println("Employee role is "+role);
        System.out.println("Employee salary is "+salary);

    }
}
public class Task {
    public static void main(String[] args) {
        Employee e= new Employee("komala", "web developer", 100000);
        e.details();

    }
}

