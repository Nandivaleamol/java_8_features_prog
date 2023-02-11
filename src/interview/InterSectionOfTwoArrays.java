package interview;

/*
 Problem Statement: Given two integer arrays firstArray and secondArray, return an array of their intersection
 Each element in the result must be unique and you may return the result in any order.

 input: int arrayFirst[] = {1,2,1,2}
        int arraySecond[] = {2,2}
 output: [2]

 input: int arrayFist[] = {4,9,5}
        int arraySecond[] = {9,4,9,84}
 output: [9,4]
 */

import java.util.Arrays;

public class InterSectionOfTwoArrays {
    public static void main(String[] args) {
//        int arrayFirst[] = {1,2,1,2};
//        int arraySecond[] = {2,2};

        int arrayFirst[] = {4,9,5};
        int arraySecond[] = {9,4,9,84};

        Arrays.stream(arrayFirst).filter(x->Arrays.stream(arraySecond).anyMatch(y->y==x)).distinct().forEach(System.out::println);

    }
}
