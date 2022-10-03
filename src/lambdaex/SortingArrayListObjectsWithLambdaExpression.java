package lambdaex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArrayListObjectsWithLambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(18);
        list.add(10);
        list.add(99);
        list.add(19);
        list.add(3);
        list.add(9);
        System.out.println(list); // [18, 10, 99, 19, 3, 9]

        Comparator<Integer> c = (I1,I2)-> (I1>I2)?1:(I1<I2)?-1:0;
        Collections.sort(list, c);
        System.out.println(list); // [3, 9, 10, 18, 19, 99]
    }
}
