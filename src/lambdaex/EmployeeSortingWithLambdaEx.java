package lambdaex;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSortingWithLambdaEx {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(102,"Amol"));
        list.add(new Employee(101,"Ankuli"));
        list.add(new Employee(103,"Rohan"));
        list.add(new Employee(104,"Chetan"));

        System.out.println("-----------Without sorting------------");
        System.out.println(list);
       // [Employee{eId=102, eName='Amol'}, Employee{eId=101, eName='Ankuli'}, Employee{eId=103, eName='Rohan'}, Employee{eId=104, eName='Chetan'}]
        // sort by id
        System.out.println("-----------Sorting By EID------------");
        Collections.sort(list, (e1,e2)-> (e1.eId< e2.eId)?-1:(e1.eId > e2.eId)?1:0);
        System.out.println(list);
        //[Employee{eId=101, eName='Ankuli'}, Employee{eId=102, eName='Amol'}, Employee{eId=103, eName='Rohan'}, Employee{eId=104, eName='Chetan'}]

        System.out.println("-----------Sorting By eName------------");
        Collections.sort(list,(e1,e2)->(e1.eName.compareTo(e2.eName)));
        System.out.println(list);
        // [Employee{eId=102, eName='Amol'}, Employee{eId=101, eName='Ankuli'}, Employee{eId=104, eName='Chetan'}, Employee{eId=103, eName='Rohan'}]
    }
}

class Employee{
    int eId;
    String eName;

    public Employee(int eId, String eName) {
        this.eId = eId;
        this.eName = eName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                '}';
    }
}