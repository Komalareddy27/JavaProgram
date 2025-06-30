
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamProg1 {
    public static void main(String[] args) {
        List <Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list);
        Stream s1=list.stream();// stream is both interface and method
        s1.forEach(System.out::println);// only once stream is printed
        // s1.forEach(System.out::println);//illegal exception
    }
}
