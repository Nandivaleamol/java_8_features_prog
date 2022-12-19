package streamapi.filters;
import java.util.Arrays;
import java.util.List;
// Problem statement:- Given a list of integer, find all even and odd numbers using Java 8 stream

public class FindEven {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("All even numbers: ");
        list.stream().filter(n->n%2==0).forEach(System.out::println);

        System.out.println("\nAll Odd numbers: ");
        list.stream().filter(n->n%2==1).forEach(System.out::println);
    }
}
