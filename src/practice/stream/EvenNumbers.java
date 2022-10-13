package practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
    Q1 Given a list of integers, find out all the even numbers exist in the list using Stream functions?
 */

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(18);
        list.add(10);
        list.add(35);
        list.add(25);
        list.add(20);
        list.add(18);
        list.add(28);

        // finding all even number given integer list , sorting and removing duplicate numbers
        List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        evenList.stream().sorted().distinct().forEach(System.out::println);

    }
}
