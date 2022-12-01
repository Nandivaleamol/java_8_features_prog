package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamImpForEachLoop {
    public static void main(String[] args) {
        IntStream.of(1,2,3,5,6,7,8,9).forEach(System.out::println);

        System.out.println("-------------square of list------------");
        List<Integer> numberList= Arrays.asList(1,3,5,6,2,8,5,4,9);

        List<Integer> squareList = numberList.stream().map(n -> n * n).distinct().toList();
        squareList.forEach(System.out::println);

        System.out.println("--------------filter()--------------");
        List<String> stringList = new ArrayList<>();
        stringList.add("John");
        stringList.add("");
        stringList.add("Danny");
        stringList.add("Locky");
        stringList.add("Chanty");
        stringList.add("");
        stringList.add("Donya");
        stringList.add("");
        stringList.add("Narya");
        stringList.add("");

        long count = stringList.stream().filter(list -> list.isEmpty()).count();
        System.out.println("Empty list objects : "+count);

        System.out.println("-----------iterate()-----------");
        IntStream.iterate(5,n->n+5).limit(10).forEach(System.out::println);

        System.out.println("----------Sorting list ascending order-----------");
        numberList.stream().sorted().forEach(System.out::println);

        System.out.println("----------Sorting list descending order-----------");
        numberList.stream().sorted((n1,n2)-> n2.compareTo(n1)).forEach(System.out::println);

        System.out.println("-----------Collectors------------");
        stringList.stream().filter(name->!name.isEmpty()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-----------------------------------");
        String combinedStrings = stringList.stream().filter(name -> !name.isEmpty()).collect(Collectors.joining(","));
        System.out.println(combinedStrings);

        System.out.println("---------mapTo()---------");
        IntSummaryStatistics summeryStatistics = numberList.stream().mapToInt(number -> number).summaryStatistics();
        System.out.println("Average : "+summeryStatistics.getAverage());
        System.out.println("Sum : "+summeryStatistics.getSum());
        System.out.println("Max Number : "+summeryStatistics.getMax());
        System.out.println("Min Number : "+summeryStatistics.getMin());
        System.out.println("Total numbers : "+summeryStatistics.getCount());

    }
}
