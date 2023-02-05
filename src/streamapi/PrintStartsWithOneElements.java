package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Problem Statement: Print numbers which are starts with one(1) to given numbers list

public class PrintStartsWithOneElements {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1010,34,4,65,1243,5567,10983,1298,3492);

        List<String> startsWithOneNumbers = numbers.stream()
                .map(n -> n + "")
                .filter(n -> n.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(startsWithOneNumbers);
    }
}
