package behavioural_pattern.template_method;

public class SavingAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按定期计算利息");
    }
}
