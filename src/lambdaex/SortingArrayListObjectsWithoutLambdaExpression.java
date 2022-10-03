package lambdaex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArrayListObjectsWithoutLambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(18);
        list.add(10);
        list.add(99);
        list.add(19);
        list.add(3);
        list.add(9);
        System.out.println(list); // [18, 10, 99, 19, 3, 9]
        Collections.sort(list,new MyComparator());
        System.out.println(list); // [3, 9, 10, 18, 19, 99]
    }
}

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer obj1, Integer obj2) {
        if (obj1> obj2){
            return 1;
        }else if (obj1<obj2){
            return -1;
        }else {
            return 0;
        }
    }
}