package consumer;

import java.util.function.Consumer;

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person("Jahn");
        System.out.println(person.getName());

        Consumer<String> nameUpdate = person::setName;
        nameUpdate.accept("Jane");
        System.out.println(person.getName());



    }
}
