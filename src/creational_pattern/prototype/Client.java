package creational_pattern.prototype;

public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("Test");
        System.out.println(((ConcretePrototype) prototype).getVal() + prototype.toString());

        Prototype clonePrototype = prototype.clone();
        System.out.println(((ConcretePrototype) clonePrototype).getVal() + clonePrototype.toString());
    }
}
