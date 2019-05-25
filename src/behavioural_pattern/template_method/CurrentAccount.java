package behavioural_pattern.template_method;

public class CurrentAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按活期计算利息");
    }

    @Override
    public boolean validate(String account, String password) {
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);
        return "薛本刚".equals(account) && "123456".equals(password);
    }
}
