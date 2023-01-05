package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Java 8 program to remove the duplicate elements from the list?
public class ListDuplicateElementRemove {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 4, 6, 6, 7, 8, 2);

        // 1st approach
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

        // 2nd approach
        List<Integer> uniqueElements = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueElements);
        Set<Integer> uniqueSet = list.stream().collect(Collectors.toSet());
        System.out.println(uniqueSet);


    }
}
