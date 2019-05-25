package creational_pattern.abstract_factory;

public class FactoryDriven {
    public static void main(String[] args) {
        //Factory通过简单工厂获取
        AbstractFactory factoryA = FactoryProducer.getFactory("FactoryA");

        AbstractFactory factoryB = FactoryProducer.getFactory("FactoryB");

        ProductA a1 = factoryA.createProductA("A1");
        a1.cretedProductA();

        ProductB b2 = factoryB.createProductB("B2");
        b2.cretedProductB();
    }
}
