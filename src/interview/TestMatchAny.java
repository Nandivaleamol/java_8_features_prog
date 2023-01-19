package interview;

import java.util.Arrays;
import java.util.List;

/*
    Problem Statement:- 1.Check if any list elements are divisible by 2, if yes print "At least one number is divisible by 2"
                            else print "Not a single element is divisible by 2" using JAVA 8 features.
 */
public class TestMatchAny {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2,4,5,6,8);

        boolean matchAny = intList.stream().anyMatch(n -> n % 2 == 0);

        if (matchAny){
            System.out.println("At least one number is divisible by 2");
        }else {
            System.out.println("Not a single element is divisible by 2");
        }
    }
}
