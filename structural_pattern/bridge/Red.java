package structural_pattern.bridge;

public class Red implements Color {
    @Override
    public void draw() {
        System.out.println(" draw red");
    }
}
