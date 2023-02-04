package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Problem Statement: Write a java program to group the words by length using java 8 features
public class GroupsByWordsLength {
     static public void main(String[] args) {

        String str = "i have a sentence with technical words";

        String[] strArr = str.trim().split(" ");

        Map<Integer,List<String>> mapLength=Arrays.stream(strArr).collect(Collectors.groupingBy(String::length));
        mapLength.forEach((integer, strings) -> System.out.println(integer+"="+strings));

    }
}
