package behavioural_pattern.chain_of_responsibility;

/**
 *@author Xue
 *@date 2018/7/19 10:21
 *@description  抽象审批者
 */
public abstract class Approver {
    protected Approver successor;
    protected String name;

    public Approver(String name){
        this.name = name;
    }

    public void setSuccessor(Approver successor){
        this.successor = successor;
    }

    /**
     * 给具体审批者提供的抽象方法
     * @param
     * @return
     */
    public abstract void processRequest(PurchaseRequest request);
}
