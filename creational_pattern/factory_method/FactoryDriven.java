package creational_pattern.factory_method;

public class FactoryDriven {
    public static void main(String[] args) {
        Factory factory = new BookFactory();
        Book book = (Book)factory.produceProduct(11, "Book");
        book.read();
    }
}
