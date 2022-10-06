package funcations;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentResults {
    public static void main(String[] args) {

        Function<Student, String> f = s->{
            String grade="";
            int marks = s.marks;
            if (marks>=80) grade="A[Distinction]";
            else if(marks>=60) grade ="B[First Class]";
            else if (marks>=50) grade ="C[Second Class]";
            else if (marks>=35) grade = "D[Third class]";
            else grade = "E[Failed]";

            return grade;
        };

        Predicate<Student> p = s-> s.marks>=60;

        Consumer<Student> c = s1 ->{
            System.out.println("Student Name : "+s1.name);
            System.out.println("Student Marks : "+s1.marks);
            System.out.println("Student Grade : "+f.apply(s1));
        };

        Student[] s = {new Student("Amol",85), new Student("Ankuli",87),new Student("Ponya",60),
                        new Student("Vijy",40), new Student("Rohan",35),new Student("Ballu", 30),
                        new Student("Rishi",54)};

        for (Student s1 : s){

            if (p.test(s1)){
                c.accept(s1);
            }

//            if (p.test(s1)){
//                System.out.println("Student Name : "+s1.name);
//                System.out.println("Student Marks : "+s1.marks);
//                System.out.println("Student Grade : "+f.apply(s1));
//            }

        }
    }
}

class Student{
    int marks;
    String name;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}