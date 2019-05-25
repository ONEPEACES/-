package structural_pattern.adapter.class_adapter;

public class Adapter extends Adaptee implements Target{
    //子类调用父类super时只是用于给子类继承父类的属性设值，并不生成父类对象

    @Override
    public void request() {
        super.specialRequest();
    }
}
