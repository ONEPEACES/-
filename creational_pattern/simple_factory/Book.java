package creational_pattern.simple_factory;

public class Book extends Product {
    public Book(double price,String productName) {
        super(price,productName);
    }
    public void read(){
        System.out.println("You read the book");
    }
}
