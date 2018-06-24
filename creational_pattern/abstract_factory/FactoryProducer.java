package creational_pattern.abstract_factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryName){
        if (factoryName.equals("FactoryA")) {
            return new ConcreteFactoryA();
        } else if (factoryName.equals("FactoryB")) {
            return new ConcreteFactoryB();
        }
        return null;
    }

}
