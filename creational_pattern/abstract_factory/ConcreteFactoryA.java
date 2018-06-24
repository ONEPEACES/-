package creational_pattern.abstract_factory;

/**
 *@author Xue
 *@date 2018/6/23 15:38
 *@description  具体的工厂子类
 */
public class ConcreteFactoryA extends AbstractFactory{
    @Override
    public ProductA createProductA(String productName) {
        if (productName == null) {
            return null;
        }
        if(productName.equals("A1")){
            return new ConcreteProductA1();
        }else if(productName.equals("A2")){
            return new ConcreteProductA2();
        }
        return null;
    }

    @Override
    public ProductB createProductB(String productName) {
        return null;
    }
}
