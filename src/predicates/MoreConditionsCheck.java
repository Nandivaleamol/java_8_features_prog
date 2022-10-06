package predicates;

import java.util.function.Predicate;

public class MoreConditionsCheck {
    public static void main(String[] args) {
        int[] arr={19,101,18,27,39,10,20,30};

        Predicate<Integer> p1 = integer -> integer%2==0;
        Predicate<Integer> p2 = integer ->  integer>10;

        for (int i : arr){
            if (p1.and(p2).test(i)){
                System.out.println(i);
            }
        }

    }
}
