package other;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSorting {

    public static void sortingWithLambdaExpression() {
        List<Employee> employees = Arrays.asList(
                new Employee("George", 10, 10000),
                new Employee("Robert", 12, 15000),
                new Employee("Kathy", 24, 25000)
        );

        employees.sort((Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
        employees.forEach(item -> System.out.println(item));
    }

    public static void sortingWithMethodReference() {
        List<Employee> employees = Arrays.asList(
                new Employee("George", 10, 10000),
                new Employee("Robert", 12, 15000),
                new Employee("Kathy", 24, 25000)
        );
        Collections.sort(
                employees, Comparator.comparing(Employee::getName));
        employees.forEach(System.out::println);
    }

    public void sortingWithMultipleAttributeUsingMethodReference() {
        List<Employee> employees = Arrays.asList(
                new Employee("George", 10, 10000),
                new Employee("Robert", 12, 15000),
                new Employee("Kathy", 24, 25000)
        );
        employees.sort(
                Comparator.comparing(Employee::getName).thenComparing(Employee::getAge)
        );
        employees.forEach(System.out::println);
    }
    }
