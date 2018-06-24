package creational_pattern.abstract_factory;

public class ConcreteFactoryB extends AbstractFactory {
    @Override
    public ProductA createProductA(String productName) {
        return null;
    }

    @Override
    public ProductB createProductB(String productName) {
        if(productName == null){
            return null;
        }
        if(productName.equals("B1")){
            return new ConcreteProductB1();
        } else if (productName.equals("B2")) {
            return new ConcreteProductB2();
        }
        return null;
    }
}
