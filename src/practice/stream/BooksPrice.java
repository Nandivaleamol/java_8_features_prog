package practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Exercise 1 — Obtain a list of Books with price > 100
 */

public class BooksPrice {
    public static void main(String[] args) {

        Book b1 = new Book(101,"AK",100);
        Book b2 = new Book(102,"BK",200);
        Book b3 = new Book(103,"CK",400);
        Book b4 = new Book(104,"DK",300);
        Book b5 = new Book(105,"GK",500);
        Book b6 = new Book(106,"HK",800);
        Book b7 = new Book(107,"KK",100);
        Book b8 = new Book(108,"AK",300);
        Book b9 = new Book(109,"LK",100);
        Book b10 = new Book(110,"AK",200);

        List<Book> bookList = Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8,b9,b10);

        // book price greater than 100
        System.out.println("-----Books list which price greater than 100Rs-----");
        List<Book> books = bookList.stream().filter(b -> b.getBookPrice() >100).collect(Collectors.toList());
       books.forEach(System.out::println);

        System.out.println("-----Book With Title 'AK'-----");
        List<Book> ak = bookList.stream().filter(b -> b.getBookTitle().equalsIgnoreCase("Ak")).collect(Collectors.toList());
        ak.forEach(System.out::println);
    }
}

class Book{
    private int bookId;
    private String bookTitle;
    private double bookPrice;

    public Book(int bookId, String bookTitle, double bookPrice) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
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