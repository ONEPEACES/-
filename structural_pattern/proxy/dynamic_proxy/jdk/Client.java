package structural_pattern.proxy.dynamic_proxy.jdk;

public class Client implements Method {
    @Override
    public void doSomething() {
        System.out.println("做点事情");
    }
}
