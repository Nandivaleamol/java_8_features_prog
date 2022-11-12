package practice.stream;

import java.util.Arrays;
import java.util.List;

/*
    Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
 */
public class FindingStartingNums {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,18,98,32);

        myList.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);

    }
}
