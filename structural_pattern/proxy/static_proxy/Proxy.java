package structural_pattern.proxy.static_proxy;

import creational_pattern.builder.Product;

public class Proxy implements Method{
    private Client client;

    Proxy(Client client){
        this.client = client;
    }

    @Override
    public void method() {
        doSomethingBefore();
        client.method();
    }

    public void doSomethingBefore(){
        System.out.println("干点事情");
    }
}
