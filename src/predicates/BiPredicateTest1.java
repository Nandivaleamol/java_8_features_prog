package predicates;

import java.util.function.BiPredicate;

public class BiPredicateTest1 {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bp = (a, b)-> (a+b)%2==0;
        System.out.println(bp.test(10,20));
        System.out.println(bp.test(5,10));
    }
}
