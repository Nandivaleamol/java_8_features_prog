package practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo03 {
    public static void main(String[] args) {

        // Creating a list of Prime Numbers
        List<Integer> primeNumbers = Arrays.asList(5, 7, 11, 13);

        // Creating a list of Odd Numbers
        List<Integer> oddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListOfInts = Arrays.asList(primeNumbers, oddNumbers, evenNumbers);

        System.out.println("Before using flatMap() : ");
        System.out.println(listOfListOfInts);

        List<Integer> integerList= listOfListOfInts.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println("After using flatMap() :");
        System.out.println(integerList);

    }
}
