package practice.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

    //natural sorting using stream api
    public void sortNaturallyUsingStream(){
        var alphabets = Arrays.asList("A", "F", "G", "j", "R", "C");
        var sortedAlphabets = alphabets.stream().sorted().toList();
        sortedAlphabets.forEach(System.out::println);
    }

    //sort Naturally In Reverse  OrderUsing Stream api
    public void sortNaturallyInReverseOrderUsingStream(){
        var alphabets = Arrays.asList("A", "F", "G", "j", "R", "C");
        var alphabetsReverseSorting = alphabets.stream().sorted(Comparator.reverseOrder()).toList();
        alphabetsReverseSorting.forEach(System.out::println);
    }


}
