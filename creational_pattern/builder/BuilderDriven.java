package creational_pattern.builder;

public class BuilderDriven {
    public static void main(String[] args) {
        //创建指挥者
        //指挥者用于调度创建者按照一定顺序或者保证对象部分完整
        Director director = new Director();
        //调用指挥者构建复杂对象的方法
        //提供构造者
        Product product = director.construct(new ConcreteBuilder());

        System.out.println(product.getPartA());
    }
}
