package interview;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


//Problem Statement 1:- Get the list of  all the products that belongs to "Books" category and product price > 200 using java 8 Features.

//Problem Statement 2:- Get the cheapest product of "Phone" category using java 8 features.

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
        Product p6 = new Product(106, "SAMSUNG", "Phone", 2000);
        Product p7 = new Product(107, "SERVLET JSP", "Books", 150);
        Product p8 = new Product(108, "HP","Laptop",50000);
        Product p9 = new Product(109, "Redmi","Phone",10000);

        System.out.println("List of  all the products that belongs to \"Books\" category and product price > 200");
        List<Product> products = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9);
         products.stream().filter(p -> p.getCategory().equals("Books") && p.getPrice()>200).forEach(System.out::println);

        System.out.println("the cheapest product of \"Phone\" category");
        Product cheapPhoneProduct = products.stream().filter(p -> p.getCategory().equalsIgnoreCase("Phone")).min(Comparator.comparingInt(Product::getPrice)).get();
        System.out.println(cheapPhoneProduct);


//-------------------------------------------Extra Work-----------------------------------------------------------------
        System.out.println("The Highest price product of products");
        Product highPriceProduct = products.stream().max(Comparator.comparing(Product::getPrice)).get();
        System.out.println(highPriceProduct);

        System.out.println("The lowest price product");
        Product cheapProduct = products.stream().min(Comparator.comparing(Product::getPrice)).get();
        System.out.println(cheapProduct);

        System.out.println("Increase 10 rs price of each product");

        List<Double> collect = products.stream().map(p -> p.getPrice() +10.00).collect(Collectors.toList());

        collect.forEach(System.out::println);
//----------------------------------------------------------------------------------------------------------------------
    }

}
