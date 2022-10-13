package streamapi;

import java.util.Arrays;
import java.util.function.Consumer;

public class ForEachMethod01 {
    public static void main(String[] args) {
        Integer[] marks = {1,3,5,2,7,9,4,8,6};

        Arrays.stream(marks).forEach(System.out::println);

        Consumer<Integer> c = i->{
            System.out.println("The square of "+i+" is :"+(i*i));
        };
        Arrays.stream(marks).forEach(c);

        // forEach
        System.out.println("--------------------------------------------");
        Arrays.stream(marks).forEach(i->{
            System.out.println("The square of "+i+" is :"+(i*i));
        });

    }
}
