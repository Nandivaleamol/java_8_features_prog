package practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("10.5","5.0","4.3","8.5","7","6");

        // Using stream flatMap(Function Mapper)
        list.stream().flatMap(num-> Stream.of(num)).forEach(System.out::println);
    }
}
