package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* Problem Statement:- Hot to get Even and Odd numbers from list using java 8 features. 2 solution.
    input: [1,2,3,4,5,6]
    output:
    Even Numbers: 2,4,6
    Odd Numbers: 1,3,5
 */

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        //----1st Solution------
        List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNumbers = list.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());

        System.out.println("Even Numbers: "+evenNumbers);
        System.out.println("Odd Numbers: "+oddNumbers);

        System.out.println("-----------------------------");
        //-----2nd Solution-------
        Map<Boolean, List<Integer>> resultMap = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNums = resultMap.get(true);
        List<Integer> oddNums = resultMap.get(false);
        System.out.println("Even Numbers: "+evenNums);
        System.out.println("Odd Numbers: "+oddNums);

    }

}
