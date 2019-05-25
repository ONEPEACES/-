package structural_pattern.bridge;

public class Client {
    public static void main(String[] args) {
        Color color = new Blue();
        Shape shape = new Square(color);
        shape.option();
    }
}
