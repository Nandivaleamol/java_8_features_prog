package streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentNamesSorting {
    public static void main(String[] args) {
        String names[] = {"Prabhas","Anushka","Vijay","Nani","Allu","Sirish","Amol"};

        // Default Natural Sorting Order
        List<String> defaultNaturalSortingNames = Arrays.stream(names).sorted().collect(Collectors.toList());
        List<String> defaultNaturalSortingNames1 = Arrays.stream(names).sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(defaultNaturalSortingNames);

        //Custom descending order sorting names
        List<String> customOrderSortedNames = Arrays.stream(names).sorted((ob1, ob2) -> ob2.compareTo(ob1)).collect(Collectors.toList());
        List<String> customOrderSortedNames1 = Arrays.stream(names).sorted((ob1, ob2) -> -ob1.compareTo(ob2)).collect(Collectors.toList());
        System.out.println(customOrderSortedNames);


    }
}
