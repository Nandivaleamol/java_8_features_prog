package streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod {
    public static void main(String[] args) {

        List<Integer>  integerList = Arrays.asList(10,18,19,20,30,25,15);

        Integer sum = integerList.stream().reduce(Integer::sum).get();
        System.out.println("Sum : "+sum);

        Integer reduceSum = integerList.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Reduce Sum : "+reduceSum);

        Integer max = integerList.stream().reduce(Integer::max).get();
        System.out.println("Max : "+max);

        Integer min = integerList.stream().reduce(Integer::min).get();
        System.out.println("Min : "+min);

        Integer totalMulti = integerList.stream().reduce((i, j) -> i*j).get();
        System.out.println("Total Multiplication : "+totalMulti);




    }
}
