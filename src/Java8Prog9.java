import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Java8Prog9 {
    public static void main(String[] args) {
        List <Integer> list= Arrays.asList(1,2,3,4);
        Consumer<Integer>obj=i-> System.out.println(i);
        list.forEach(obj);
    }
}
