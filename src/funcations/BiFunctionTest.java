package funcations;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>();
        BiFunction<Integer, String, Employee> bf = (id, name) ->new Employee(id, name);

        l.add(bf.apply(100,"Amol"));
        l.add(bf.apply(200, "Ankuli"));
        l.add(bf.apply(300,"Rohan"));
        l.add(bf.apply(400,"Snehal"));
        l.add(bf.apply(500,"Vijay"));

        for (Employee e : l){
            System.out.println("Employee Id : "+e.id);
            System.out.println("Employee Name : "+e.name);
            System.out.println();
        }
    }
}

class Employee{
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
}