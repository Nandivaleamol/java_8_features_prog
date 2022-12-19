package practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Exercise 1 — Obtain a list of Books with price > 100
 */

public class BookMain {
    public static void main(String[] args) {

        Book b1 = new Book(101,"AK",100,new Author("John","Markus","Male",30));
        Book b2 = new Book(102,"BK",200,new Author("Piter","Lomba","Male",55));
        Book b3 = new Book(103,"CK",400,new Author("Luka","Shanko","Male",24));
        Book b4 = new Book(104,"DK",300,new Author("Jeni","Kanji","Female",25));
        Book b5 = new Book(105,"GK",500,new Author("Joni","Mark","Male",30));
        Book b6 = new Book(106,"HK",800,new Author("Harry","Potter","Male",45));
        Book b7 = new Book(107,"KK",100,new Author("Sanko","Kali","Female",20));
        Book b8 = new Book(108,"AK",300,new Author("Tony","Stark","Male",60));
        Book b9 = new Book(109,"LK",100,new Author("Pony","Markus","Female",42));
        Book b10 = new Book(110,"AK",200,new Author("Nancy","Jona","Female",52));

        List<Book> bookList = Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8,b9,b10);

        // book price greater than 100
        System.out.println("-----Books list which price greater than 100Rs-----");
        List<Book> books = bookList.stream().filter(b -> b.getBookPrice() > 100).toList();
       books.forEach(System.out::println);

        System.out.println("-----Book With Title 'AK'-----");
        List<Book> ak = bookList.stream().filter(b -> b.getBookTitle().equalsIgnoreCase("Ak")).toList();
        ak.forEach(System.out::println);

        //Get the unique surnames in uppercase of the first 15 book
        //authors that are 50 years old or over.

        System.out.println("Get the unique surnames in uppercase of the first 15 book authors that are 50 years old or over.");
        var olderAuthor = bookList.stream().map(Book::getAuthor).filter(author -> author.getAge() >= 50).distinct().limit(15).map(Author::getSurname).map(String::toUpperCase).toList();
        olderAuthor.forEach(System.out::println);

        //Compute the sum of ages of all female authors younger than 25.
        System.out.println("Compute the sum of ages of all female authors younger than 25.");
        int ageSum = bookList.stream().map(Book::getAuthor).filter(author -> author.getGender().equalsIgnoreCase("Female")).map(Author::getAge).filter(age -> age < 25).reduce(0, Integer::sum);
        System.out.println(ageSum);

        // increase every book price to 10%
        var updatePriceBooks = bookList.stream().peek(book -> book.setBookPrice(book.getBookPrice() * 1.10)).toList();

        updatePriceBooks.forEach(System.out::println);

    }
}

class Author{

    private String firstname;
    private String surname;
    private String gender;
    private int age;

    public Author(String firstname, String surname, String gender, int age) {
        this.firstname = firstname;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

class Book{
    private int bookId;
    private String bookTitle;
    private double bookPrice;

    private Author author;

    public Book(int bookId, String bookTitle, double bookPrice, Author author) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookPrice=" + bookPrice +
                ", author=" + author +
                '}';
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}