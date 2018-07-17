package structural_pattern.bridge;

public abstract class Shape {
    protected Color color;

    /**
     * 抽象类提供地构造器，子类必须实现
     * @param
     * @return
     */
    public Shape(Color color){
        this.color = color;
    }

    public abstract void option();

}
