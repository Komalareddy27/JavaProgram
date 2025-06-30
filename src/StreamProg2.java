import java.util.Arrays;
import java.util.List;

public class StreamProg2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,7,9,5,3,4,5,6,7,7,7);
//        list.stream().distinct().forEach(System.out::println);
//        list.stream().sorted().forEach(System.out::println);
//        list.stream().skip(2).forEach(System.out::println);
//        list.stream().limit(4).forEach(System.out::println);
        long i=list.stream().count();
        System.out.println(i);
    }
}
