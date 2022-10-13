package streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinMaxNumber {
    public static void main(String[] args) {

        Integer []marks ={1,10,3,5,8,9,6,4};

        Integer min = Arrays.stream(marks).min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("Min : "+min);

        Integer max = Arrays.stream(marks).max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Max : "+max);
    }
}
