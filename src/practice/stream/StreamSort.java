package practice.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

    //natural sorting using stream api
    public void sortNaturallyUsingStream(){
        List<String> alphabets = Arrays.asList("A", "F", "G", "j", "R", "C");
        List<String> sortedAlphabets = alphabets.stream().sorted().collect(Collectors.toList());
        sortedAlphabets.forEach(System.out::println);
    }

    //sort Naturally In Reverse  OrderUsing Stream api
    public void sortNaturallyInReverseOrderUsingStream(){
        List<String> alphabets = Arrays.asList("A", "F", "G", "j", "R", "C");
        List<String> alphabetsReverseSorting = alphabets.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        alphabetsReverseSorting.forEach(System.out::println);
    }


}
