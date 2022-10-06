package predicates;

import java.util.function.Predicate;

// Write a Predicate to check whether length of string is > 5  or not
public class PredicateDemo01 {
    public static void main(String[] args) {

        String[] s = {"Ankuli", "Amol","Anmol","Anuj","Vijay","Vignu","Makadu"};
        Predicate<String> p = s1->s1.length()%2==0;

        for (String s1 : s){

            if (p.test(s1)){
                System.out.println(s1);
            }
        }
    }
}
