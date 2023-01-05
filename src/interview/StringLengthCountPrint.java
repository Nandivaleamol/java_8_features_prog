package interview;

import java.util.Arrays;
import java.util.List;

//Java 8 program to Print Strings whose length is greater than 3 in List.
public class StringLengthCountPrint {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");

        stringList.stream().filter(str->str.length()>3).forEach(System.out::println);
    }
}
