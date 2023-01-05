package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//Java 8 program to find the Minimum number of a Stream?
public class MinimumNumberOfStream {
    public static void main(String[] args) {
        Integer integer = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(integer);
    }
}
