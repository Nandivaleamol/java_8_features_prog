package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Java 8 program to multiply 3 to all element in list and print the list?
public class MultiplyListElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        List<Integer> integerList = list.stream().map(n -> n * 3).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
