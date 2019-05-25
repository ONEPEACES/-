package structural_pattern.facade;

public class Facade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade(){
        this.systemA = new SystemA();
        this.systemB = new SystemB();
        this.systemC = new SystemC();
    }

    public void wrapOperation(){
        systemA.operationA();
        systemB.operationB();
        systemC.operationC();
    }
}
