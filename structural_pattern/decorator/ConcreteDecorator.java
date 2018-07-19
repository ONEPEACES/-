package structural_pattern.decorator;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        addBehaviour();
        super.operation();
    }

    /**
     * 具体装饰的内容延迟到子类
     * @param
     * @return
     */
    public void addBehaviour(){
        System.out.print("装饰 ");
    }
}
