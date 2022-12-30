package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMarksOperations {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(18);
        marks.add(30);
        marks.add(50);
        marks.add(25);
        marks.add(60);
        marks.add(40);
        marks.add(80);
        marks.add(70);
        marks.add(90);
        marks.add(65);
        marks.add(95);
        System.out.println(marks);

        // counting how many students are failed
        long count = marks.stream().filter(i -> i < 35).count();
        System.out.println("Total Failed Students : "+count);

        // counting how many students are passed
        long count1 = marks.stream().filter(i -> i >= 35).count();
        System.out.println("Total Pass Students : "+count1);

        // adding 5 grace marks who failed...
        List<Integer> updateMarks = marks.stream().filter(i -> i <35).map(i -> i + 5).collect(Collectors.toList());
        System.out.println("After adding grace marks");
        updateMarks.forEach(System.out::println);

        // sorting marks by ascending order
        List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending order sorting: ");
        sortedMarks.forEach(System.out::println);

        System.out.println("Descending order sorting: ");
        // sorting marks by descending order
        // using Comparator interface-> compare(obj1 , obj2) method
        List<Integer> desSortingMarksByComparator = marks.stream().sorted((o1, o2) -> (o1 < o2) ? 1 : (o1 > o2) ? -1 : 0).collect(Collectors.toList());
        System.out.println(desSortingMarksByComparator);

        // using Comparable interface-> obj1.compareTo(obj2);
        List<Integer> desSortingMarksByComparable = marks.stream().sorted((ob1, ob2) -> -ob1.compareTo(ob2)).collect(Collectors.toList());
        List<Integer> desSortingMarksByComparable2 = marks.stream().sorted((ob1, ob2) -> ob2.compareTo(ob1)).collect(Collectors.toList());
        System.out.println(desSortingMarksByComparable2);
        System.out.println(desSortingMarksByComparable);
    }
}
