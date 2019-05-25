package behavioural_pattern.template_method;

public class Client {
    public static void main(String[] args) {
        Account account = new CurrentAccount();
        // 子类覆盖父类的带有boolean类型返回值的方法对父类方法进行限制
        // 称作钩子方法
        account.handle("张无忌","123456");
    }
}
