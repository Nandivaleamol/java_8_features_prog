package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Java 8 program to sort the given list?
public class SortList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        /*integerList.sort((c,d)->c-d);
        System.out.println(integerList)*/;

        List<Integer> sorted = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

    }
}
