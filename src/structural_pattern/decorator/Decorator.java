package structural_pattern.decorator;

public class Decorator implements Component{
    //聚合待装饰的构件
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
