package creational_pattern.factory_method;

public class BookFactory extends Factory {
       @Override
    public Product produceProduct(double price, String productName) {
        return new Book(price,productName);
    }
}
