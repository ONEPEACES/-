package structural_pattern.bridge;

public class Circle extends Shape {
    public Circle(Color color) {
        //调用父类super，给子类从父类继承过来的值赋值
        super(color);
    }

    @Override
    public void option() {
        System.out.print("circle");
        this.color.draw();
    }
}
