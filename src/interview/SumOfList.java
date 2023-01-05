package interview;

import java.util.Arrays;
import java.util.List;

//Write a Java 8 program to get the sum of all numbers present in a list?
public class SumOfList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);

        int sum = integerList.stream().mapToInt(Integer::valueOf).sum();
        System.out.println(sum);
    }
}
