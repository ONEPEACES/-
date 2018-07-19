package behavioural_pattern.chain_of_responsibility;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(510000, 10, "座椅");
        Approver approver = new Director("李家");
        Approver approver1 = new VicePresident("李之龙");
        Approver approver2 = new President("梁奎");
        Approver approver3 = new Congress("");
        approver.setSuccessor(approver1);
        approver1.setSuccessor(approver2);
        approver2.setSuccessor(approver3);
        approver.processRequest(request);
    }
}
