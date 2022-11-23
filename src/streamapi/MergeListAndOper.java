package streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeListAndOper {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(4,5,6,7,8,9);

        //merging to lists in single list(concatenation)
        var fullList = Stream.concat(list1.stream(), list2.stream());

        var allElements = fullList.toList();
        System.out.println("Merged List:");
        System.out.println(allElements);

        //getting unique elements
        var uniqueElements = new HashSet<>(allElements);
        System.out.println(uniqueElements);

        var min = uniqueElements.stream().min((x1, x2) -> x1 - x2).get();
        System.out.println(min);

        var max = uniqueElements.stream().max((x1, x2) -> x1 - x2).get();
        System.out.println(max);


    }
}
