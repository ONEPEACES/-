package structural_pattern.flyweight;

public class Client {
    public static void main(String[] args) {
        IgoChessmanFactory instance = IgoChessmanFactory.getInstance();
        BlackIgoChessman b = (BlackIgoChessman)instance.getIgoChessman("c");
        if (b != null)
        b.display(new Coordinates(1,1));
    }
}
