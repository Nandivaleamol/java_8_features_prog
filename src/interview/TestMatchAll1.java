package interview;

import java.util.Arrays;
import java.util.List;
/*
    Problem Statement:- 1.Check if all the list elements are divisible by 2, if yes print "All the numbers are divisible by 2"
                            else print "All the numbers are not divisible by 2" using JAVA 8 features.
 */
public class TestMatchAll1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,5,6,8);
        boolean allDivisibleByTwo = list.stream().allMatch(n -> n % 2 == 0);

        divisible(allDivisibleByTwo);
    }
    public static void divisible(boolean flag){
        if (flag){
            System.out.println("All the numbers are divisible by 2");
        }else{
            System.out.println("All the numbers are not divisible by 2");
        }
    }
}
