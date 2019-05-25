package creational_pattern.simple_factory;

public class Factory {

    public static Product getProduct(double price,String productName){
        if ("Pen".equals(productName)) {
            return new Pen(price,productName);
        }else if ("Book".equals(productName)){
            return new Book(price,productName);
        }else {
            return new OtherProduct(price,productName);
        }
    }
}
