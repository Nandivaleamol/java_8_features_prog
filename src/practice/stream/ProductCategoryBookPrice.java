package practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
public class ProductCategoryBookPrice {
    public static void main(String[] args) {

        Product p1 = new Product(101,"Book","BK",200);
        Product p2 = new Product(102,"Beauty","BK",100);
        Product p3 = new Product(103,"Food","FK",200);
        Product p4 = new Product(104,"Book","KK",200);
        Product p5 = new Product(105,"Toy","DK",400);
        Product p6 = new Product(106,"Mobile","MK",5000);
        Product p7 = new Product(107,"Laptop","LK",10000);
        Product p8 = new Product(108,"Book","GK",300);
        Product p9 = new Product(109,"Toy","OK",500);
        Product p10 = new Product(110,"Beauty","PK",300);

        List<Product> productList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

        System.out.println("----Products with Category Book and Price greater than 100----");
        List<Product> bookList = productList.stream()
                .filter(p -> p.getpCategory().equalsIgnoreCase("Book"))
                .filter(price -> price.getPrice() > 100)
                .collect(Collectors.toList());
        bookList.forEach(System.out::println);

        // Exercise 2 — Obtain a list of order with products belong to category “Beauty”
        System.out.println("----Products with Category Beauty----");
        List<Product> beautyList = productList.stream()
                .filter(p -> p.getpCategory()
                        .equalsIgnoreCase("Beauty"))
                .collect(Collectors.toList());
        beautyList.forEach(System.out::println);

        // Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
        System.out.println("----Products with Category Toy and Applying 10% Discount----");
        List<Double> toyList = productList.stream()
                .filter(t -> t.getpCategory().equalsIgnoreCase("Toy"))
                .map(d -> d.getPrice() * 0.9)
                .collect(Collectors.toList());
        toyList.forEach(System.out::println);

        
    }

}
