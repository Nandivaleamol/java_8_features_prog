package practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// we will look at how to group by a list of employees using streams  API.
public class EmployeeGroupByCity {
    public static void main(String[] args) {

        List<Employee1> employee1List = new ArrayList<>();
        employee1List.add(new Employee1("A","Pune"));
        employee1List.add(new Employee1("B","Mumbai"));
        employee1List.add(new Employee1("C","Pune"));
        employee1List.add(new Employee1("D","Pune"));
        employee1List.add(new Employee1("E","Hyderabad"));
        employee1List.add(new Employee1("F","Bangalore"));

        Map<String, List<Employee1>> stringListMap = employee1List.stream().collect(Collectors.groupingBy(Employee1::getCity));
        System.out.println(stringListMap);
    }
}
