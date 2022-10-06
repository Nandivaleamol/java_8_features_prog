package predicates;

import java.util.function.Predicate;

public class OddNumbers {
    public static void main(String[] args) {

        int[] arr ={12,34,7,18,11,99,19,10};

        Predicate<Integer> p = i -> i%2==0;
        for (int i1 : arr){
            if (p.negate().test(i1)){
                System.out.println(i1);
            }
        }
    }
}
