package structural_pattern.proxy.static_proxy;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        Proxy proxy = new Proxy(client);
        proxy.method();
    }
}
