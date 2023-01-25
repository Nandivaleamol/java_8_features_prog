package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListAddNums {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Consumer<Integer> numberAdder = numbers::add;
        numberAdder.accept(1);
        numberAdder.accept(2);
        numberAdder.accept(3);

        System.out.println(numbers);
    }
}
