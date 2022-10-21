package practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo02 {
    public static void main(String[] args) {

        // creating a list of Strings
        List<String> stringList = Arrays.asList("Java","Coding","Programming","Language");

        // Using stream flatMap(Function mapper)
        stringList.stream().flatMap(str-> Stream.of(str.charAt(2))).forEach(System.out::println);
    }
}
