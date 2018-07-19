package structural_pattern.decorator;

public class Client {
    public static void main(String[] args) {
        //装饰模式相对于直接继承进行额外职责的追加更灵活
        //未装饰前的构件
        Component component = new ConcreteComponent();
        component.operation();
        //装饰后的构件
        component = new ConcreteDecorator(component);
        component.operation();
    }
}
