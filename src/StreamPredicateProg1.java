import java.util.Arrays;
import java.util.List;


public class StreamPredicateProg1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,6);
       list.stream().filter((i)->i%2==0).forEach(System.out::println);

        };
    }

