package other;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListByTwoFields {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1,"Core Java",120,"Sagar",200.00));
        bookList.add(new Book(2,"Servlet-Jsp",200,"Ashok",300.00));
        bookList.add(new Book(3,"Spring Boot",150,"Amol",150.00));
        bookList.add(new Book(4,"Microservices",70,"Suraj",100.00));
        bookList.add(new Book(5,"Java Full Stack",400,"Akash",1000.00));

        //sorted by book names
        System.out.println("--------Sorting by book names--------");
       bookList.stream().sorted((book1, book2) -> book1.getName().compareTo(book2.getName())).toList().forEach(System.out::println);

       //sorting by book pages
        System.out.println("--------Sorting by book pages--------");
        bookList.stream().sorted((book1,book2)->book1.getPages().compareTo(book2.getPages())).forEach(book -> System.out.println(book));

        // Create Comparators for Name, Author & Cost fields respectively
        System.out.println("\nSort list of book objects by name then by author then by cost");
        Comparator<Book> sortedByName = (book1,book2)->book1.getName().compareToIgnoreCase(book2.getName());
        Comparator<Book> sortedByAuthor = (book1,book2)->book1.getAuthor().compareToIgnoreCase(book2.getAuthor());
        Comparator<Book> sortedByCost = (book1,book2)->book1.getCost().compareTo(book2.getCost());

        bookList
                .stream()
                .sorted(sortedByName
                        .thenComparing(sortedByAuthor)
                        .thenComparing(sortedByCost)
                ).forEach(System.out::println);

    }
}
