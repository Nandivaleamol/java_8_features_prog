package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPrintElements {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        Consumer<String> printer = System.out::println;  // by method reference
        Consumer<String> printer1 = (s)-> System.out.println(s); // by lambda expression

        names.forEach(printer);
        System.out.println("------------");
        names.forEach(printer1);
    }
}
