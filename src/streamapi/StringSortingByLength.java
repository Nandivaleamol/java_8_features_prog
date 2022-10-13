package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortingByLength {
    public static void main(String[] args) {
        String[] names = {"AA","AAAAA","A","BB","YYA","XXX","YYZXXXY"};

        //ascending sorting according to name length...
        Comparator<String> c = (s1, s2)->{
            int l1 = s1.length();
            int l2 = s2.length();

            if(l1<l2) return -1;
            else if (l1>l2) return 1;
            else return s1.compareTo(s2);
        };

        List<String> sortingByNameLength = Arrays.stream(names).sorted(c).collect(Collectors.toList());
        System.out.println(sortingByNameLength);


        //descending sorting according to name length...
        Comparator<String> cr = (s1,s2)->{
            int l1 = s1.length();
            int l2 = s2.length();

            if (l1<l2) return 1;
            else if (l1>l2) return -1;
            else return s1.compareTo(s2);
        };
        List<String> revSorted = Arrays.stream(names).sorted(cr).collect(Collectors.toList());
        System.out.println(revSorted);
    }
}
