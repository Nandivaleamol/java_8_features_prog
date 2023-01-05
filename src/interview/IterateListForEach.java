package interview;

import java.util.Arrays;
import java.util.List;

//Java 8 program to iterate a Stream using the forEach method?
public class IterateListForEach {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Interview","Questions","Answers");

        list.forEach(System.out::println);
    }
}
