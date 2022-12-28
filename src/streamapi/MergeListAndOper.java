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
         Stream<Integer> fullList = Stream.concat(list1.stream(), list2.stream());

        List<Integer> allElements = fullList.collect(Collectors.toList());
        System.out.println("Merged List:");
        System.out.println(allElements);

        //getting unique elements
        HashSet<Integer> uniqueElements = new HashSet<Integer>(allElements);
        System.out.println(uniqueElements);

        Integer min = uniqueElements.stream().min((x1, x2) -> x1 - x2).get();
        System.out.println(min);

        Integer max = uniqueElements.stream().max((x1, x2) -> x1 - x2).get();
        System.out.println(max);


    }
}
