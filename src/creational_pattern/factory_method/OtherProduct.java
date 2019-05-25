package creational_pattern.factory_method;

import creational_pattern.simple_factory.Product;

public class OtherProduct extends Product {
    public OtherProduct(double price, String productName) {
        super(price, productName);
    }
}
