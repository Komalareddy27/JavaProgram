class  Student{
    private int id=20;
    public String name="komala";
    void displayDetails(){
        System.out.println("my name is"+ " "+name+ " "+"and id is"+ " "+id);
    }
}
public class Task2 {
    public static void main(String[] args) {
        Student  s=new Student();
        s.displayDetails();

    }
}
