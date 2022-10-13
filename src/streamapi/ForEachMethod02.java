package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachMethod02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(0);
        list.add(8);

        // converting arraylist to Integer array
        Integer[] i = list.stream().toArray(Integer[]::new);
        // printing Integer array

        // using Stream.of() static method
        System.out.println("Using Stream.of() method");
        Stream.of(i).sorted().forEach(System.out::println);

        // using Arrays utility class
        System.out.println("Using Arrays utility class");
        Arrays.stream(i).sorted().forEach(System.out::println);

        // simple forEach loop
        System.out.println("Using simple forEach loopx");
        for (Integer i1: i){
            System.out.println(i1);
        }

        // sorting
        System.out.println("Sorting using sorted() method");
        List<Integer> sortedArray = Arrays.stream(i).sorted().collect(Collectors.toList());
        sortedArray.forEach(System.out::println);

        System.out.println("Getting using simple forEach Loop");
        for (Integer i2 : sortedArray){
            System.out.println(i2);
        }
    }
}
