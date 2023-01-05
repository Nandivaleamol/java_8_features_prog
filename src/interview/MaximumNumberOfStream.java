package interview;


import java.util.Comparator;
import java.util.stream.Stream;
//Java 8 program to find the Maximum number of a Stream?
public class MaximumNumberOfStream {
    public static void main(String[] args) {
        Integer max = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("The Maximum number is: " + max);
    }
}
