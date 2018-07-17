package structural_pattern.bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void option() {
        System.out.print("square");
        color.draw();
    }
}
