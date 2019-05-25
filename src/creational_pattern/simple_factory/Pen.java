package creational_pattern.simple_factory;

public class Pen extends Product{
    public Pen(double price, String productName) {
        super(price, productName);
    }

    public void write(){
        System.out.println("You write something whit pen");
    }

}
