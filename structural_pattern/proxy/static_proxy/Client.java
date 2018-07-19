package structural_pattern.proxy.static_proxy;

public class Client implements Method{
    @Override
    public void method() {
        System.out.println("客户端被使用");
    }
}
