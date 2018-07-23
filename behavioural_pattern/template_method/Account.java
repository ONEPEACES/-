package behavioural_pattern.template_method;

public abstract class Account {
    /**
     * 钩子方法
     * 子类可以通过覆盖该方法限制父类模板方法的使用
     * @param
     * @return
     */
    public boolean validate(String account, String password) {
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);
        return "张无忌".equals(account) && "123456".equals(password);
    }

    public abstract void calculateInterest();

    public void display(){
        System.out.println("显示利息");
    }

    public void handle(String account,String password){
        //钩子方法
        if(!validate(account,password)){
            System.out.println("账号或密码错误");
            return;
        }
        calculateInterest();
        display();
    }
}
