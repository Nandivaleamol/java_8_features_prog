package interview;

import java.util.List;
import java.util.Arrays;

public class SortStringLIstAsLengthOfString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "programming");

        //ascending order
        System.out.println("---Ascending order---");
        words.sort((s1,s2)->s1.length() - s2.length());
        words.forEach(System.out::println);

        //descending order
        System.out.println("---Descending order---");
        words.sort((s1,s2)->s2.length() - s1.length());
        words.forEach(System.out::println);
    }
}
