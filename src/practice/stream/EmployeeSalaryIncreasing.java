package practice.stream;
/*
    Question 1:
    There is a list of employees and the candidate needs to increase the salary of the employees by 10% whose age is greater than 25 years.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalaryIncreasing {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A",23,20000));
        employees.add(new Employee("B",25,10000));
        employees.add(new Employee("C",27,25000));
        employees.add(new Employee("D",29,15000));
        employees.add(new Employee("E",26,12000));

        System.out.println("Original salary");
        System.out.println(employees);

        List<Employee> employeeList = employees.stream().map(e -> {
            if (e.getAge() >= 25) {
                e.setSalary(e.getSalary() * 1.10);
            }
            return e;
        }).collect(Collectors.toList());

        System.out.println("Incremented Salary");
        System.out.println(employeeList);
    }
}
