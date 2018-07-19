package structural_pattern.proxy.dynamic_proxy.jdk;

public class Test {
    public static void main(String[] args) {
        ClientProxy proxy = new ClientProxy();
        Method method = (Method)proxy.createProxy(new Client());
        method.doSomething();
    }
}
