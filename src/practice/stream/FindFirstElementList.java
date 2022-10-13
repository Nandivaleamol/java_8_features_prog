package practice.stream;

import java.util.Arrays;
import java.util.List;

public class FindFirstElementList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(18,10,99,19,20,15,23);

        list.stream().findFirst().ifPresent(System.out::println);
        list.stream().findAny().ifPresent(System.out::println);
    }
}
