package creational_pattern.factory_method;

import creational_pattern.simple_factory.Product;

public class Pen extends Product{
    public Pen(double price, String productName) {
        super(price, productName);
    }

    public void write(){
        System.out.println("You write something whit pen");
    }

}
