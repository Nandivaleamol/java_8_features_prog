package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Java 8 program to Count Strings whose length is greater than 3 in List?
public class StringLengthCount {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");

        Long counts = stringList.stream().filter(str -> str.length() > 3).count();
        System.out.println(counts);
    }
}
