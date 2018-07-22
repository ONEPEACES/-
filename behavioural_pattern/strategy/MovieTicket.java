package behavioural_pattern.strategy;

public class MovieTicket {
    private double price;
    private Discount discount;

    public void setPrice(double price){
        this.price = price;
    }

    public void setDiscount(Discount discount){
        this.discount = discount;
    }

    /**
     * 调用具体的打折算法
     * @param
     * @return
     */
    public double getPrice(){
        return discount.calculate(this.price);
    }
}
