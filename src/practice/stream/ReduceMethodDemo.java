package practice.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceMethodDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(18,10,19,99);

        Integer reduce = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(reduce);
    }
}
