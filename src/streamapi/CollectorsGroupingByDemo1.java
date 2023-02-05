package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingByDemo1 {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Andy","London",23));
        personList.add(new Person("Rocky","India",25));
        personList.add(new Person("Johny","USA",23));
        personList.add(new Person("Danny","London",25));
        personList.add(new Person("Mark","London",25));
        personList.add(new Person("Munna","India",23));
        personList.add(new Person("Jacky","India",26));


        System.out.println("----------------GroupingByCity----------------");
        Map<String, List<Person>> groupingByCity = personList.stream().collect(Collectors.groupingBy(Person::getCity));
        groupingByCity.forEach((city,persons)->{
            System.out.println(city);
            System.out.println(persons);
        });

        System.out.println();
        System.out.println("----------------GroupingByAge----------------");
        Map<Integer, List<Person>> groupingByAge = personList.stream().collect(Collectors.groupingBy(Person::getAge));
        groupingByAge.forEach((age, persons)->{
            System.out.println(age);
            System.out.println(persons);
        });

        System.out.println("-------Sort Person By Age in Descending Order--------");
        List<Person> sortedList = personList.stream().sorted((e1, e2) -> e2.getAge() - e1.getAge()).collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("-------Sort Person By Age in natural default sorting order--------");
        List<Person> collect = personList.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
        System.out.println(collect);
    }
}

class Person{
    private String name;
    private String city;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
