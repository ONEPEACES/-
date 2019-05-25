package creational_pattern.factory_method;

public class Book extends Product {
    public Book(double price, String productName) {
        super(price,productName);
    }
    public void read(){
        System.out.println("You read the book");
    }
}
