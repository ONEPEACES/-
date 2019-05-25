package creational_pattern.abstract_factory;

public abstract class AbstractFactory {
    public abstract ProductA createProductA(String productName);
    public abstract ProductB createProductB(String productName);
}
