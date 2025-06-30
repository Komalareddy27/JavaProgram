import org.w3c.dom.ls.LSOutput;

import java.lang.Override;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class reduceProg {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(6);
        set.add(9);
        set.add(12);
//        Function<Integer, Integer> f=new Function<Integer, Integer>() {
//
//            @Override
//            public Integer apply(Integer i) {
//                return i*2;
//            }
//        };
//      queue.stream().filter((i) -> i % 2 == 0).map(f).forEach(System.out::println);
//        BinaryOperator<Integer> p=new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer i, Integer j) {
//                return i+j;
//            }
//        };
       Integer sum= set.stream().filter((i) -> i % 2 == 0).map(i->i*2).reduce(0,(i,j)->i+j);
       System.out.println(sum);
    }
}