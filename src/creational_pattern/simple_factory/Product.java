package creational_pattern.simple_factory;

public class Product {
    private double price;
    private String productName;

    protected Product(double price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
