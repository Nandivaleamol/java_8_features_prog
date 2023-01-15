package interview;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Java 8 Program to Print ten random numbers using forEach?
public class RandomNumbers {
    public static void main(String[] args) {

        // 1st approach
        Random random = new Random();
        IntStream limit = random.ints().limit(10);
        limit.forEach(System.out::println);

        System.out.println("----------------------");

        // 2nd approach
        IntStream intStream = IntStream.generate(()->new Random().nextInt());
        intStream.limit(10).forEach(System.out::println);

    }
}
