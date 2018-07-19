package behavioural_pattern.chain_of_responsibility;

public class Director extends Approver {
    //从父类继承的属性，属于子类对象
    public Director(String name) {
        //调用父类的构造方法，创建子类对象
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 50000){
            System.out.println("主任" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");
        }else {
            this.successor.processRequest(request);
        }
    }
}
