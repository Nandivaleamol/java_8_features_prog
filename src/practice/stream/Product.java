package practice.stream;

public class Product {
    private int pId;
    private String pCategory;
    private String pName;
    private double price;

    public Product(int pId, String pCategory, String pName, double price) {
        this.pId = pId;
        this.pCategory = pCategory;
        this.pName = pName;
        this.price = price;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpCategory() {
        return pCategory;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", pCategory='" + pCategory + '\'' +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                '}';
    }
}
