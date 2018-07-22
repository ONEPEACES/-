package behavioural_pattern.strategy;

public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("VIP票");
        return price * 0.5;
    }
}
