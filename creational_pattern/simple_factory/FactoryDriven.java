package creational_pattern.simple_factory;

public class FactoryDriven {
    public static void main(String[] args) {
        Pen pen = (Pen)Factory.getProduct(10,"Pen");
        pen.write();
    }
}
