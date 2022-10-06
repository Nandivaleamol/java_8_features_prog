package predicates;

import java.util.function.Predicate;

public class EvenNumbers {
    public static void main(String[] args) {

        int[] arr ={10,18,99,19,7,20,2};

        Predicate<Integer> p = i->i%2==0;

        for (int i1 : arr){

            if (p.test(i1)){
                System.out.println(i1);
            }
        }
    }
}
