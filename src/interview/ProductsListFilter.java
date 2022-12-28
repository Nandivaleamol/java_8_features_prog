package interview;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Problem Statement:- Get the list of  all the products that belongs to "Books" category and product price > 200 using java 8 Features.

class Product{
    private int id;
    private String name;
    private String category;
    private int price;

    public Product(int id, String name, String category, int price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ProductsListFilter {
    public static void main(String[] args) {

        Product p1 = new Product(101, "JAVA", "Books", 200);
        Product p2 = new Product(102, "SPRING", "Books", 250);
        Product p3 = new Product(103, "HTML", "Books",100 );
        Product p4 = new Product(104, "PYTHON", "Books", 300);
        Product p5 = new Product(105, "NOKIA", "Phone", 15000);
        Product p6 = new Product(106, "SAMSUNG", "Phone", 20000);
        Product p7 = new Product(107, "SERVLET JSP", "Books", 150);
        Product p8 = new Product(108, "HP","Laptop",50000);

        List<Product> products = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
         products.stream().filter(p -> p.getCategory().equals("Books") && p.getPrice()>200).forEach(System.out::println);

    }

}
