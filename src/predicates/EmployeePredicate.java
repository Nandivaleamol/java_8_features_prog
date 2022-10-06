package predicates;

import functionalinterfaces.A;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicate {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>();
       l.add(new Employee("Amol",5000));
       l.add(new Employee("Ankuli", 6000));
       l.add(new Employee("Vijay",3000));
       l.add(new Employee("Ponya",2000));
       l.add(new Employee("Sagar", 1000));
       l.add(new Employee("Rohan",4000));

       Predicate<Employee> p= e->e.salary>3000;

       for (Employee e1 : l){
           if (p.test(e1)){
               System.out.println(e1.name+" : "+e1.salary);
           }
       }

    }
}

class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
}
