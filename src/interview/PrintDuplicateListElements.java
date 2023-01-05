package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// print duplicate elements
public class PrintDuplicateListElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 4, 6, 6, 7, 8, 2);

        Set<Integer> set = new HashSet<>();

        list.stream().filter(n-> !set.add(n)).forEach(System.out::println);

    }
}
