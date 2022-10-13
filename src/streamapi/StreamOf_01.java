package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOf_01 {
    public static void main(String[] args) {
       // Stream<Integer> s = Stream.of(13,5,6,8,9,3,4,7);
//       s.forEach(System.out::println);

        Integer[] nums = {13,5,6,8,9,3,4,7};
        List<Integer> s = Arrays.stream(nums).collect(Collectors.toList());

        List<Integer> evenList = s.stream().map(i->i+5).filter(i -> i % 2 == 0).sorted().collect(Collectors.toList());
        List<Integer> evenList2 = s.stream().map(i->i+5).filter(i -> i % 2 == 0).sorted((i1,i2)->-i1.compareTo(i2)).map(i->i*10).filter(i->i>=100).collect(Collectors.toList());
        evenList.forEach(System.out::println);

        System.out.println("Custom Sorted list");
       evenList2.forEach(System.out::println);
    }
}
