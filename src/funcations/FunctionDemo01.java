package funcations;

import java.util.function.Function;

public class FunctionDemo01 {
    public static void main(String[] args) {

        Function<Integer, Integer> f = i-> i*i;
        System.out.println(f.apply(5));
        System.out.println(f.apply(4));
    }
}
