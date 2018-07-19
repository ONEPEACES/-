package structural_pattern.composite;

public class Client {
    public static void main(String[] args) {
        Component text1 = new TextLeaf("a.txt");
        Component text2 = new TextLeaf("b.txt");
        Component text3 = new TextLeaf("c.txt");
        Component Img1 = new ImgLeaf("1.image");
        Component Img2 = new ImgLeaf("2.image");
        Component Img3 = new ImgLeaf("3.image");
        Component folder1 = new Composite("directory1");
        Component folder2 = new Composite("directory2");
        Component folder3 = new Composite("directory3");
        ((Composite) folder1).add(text1);
        ((Composite) folder2).add(text2);
        ((Composite) folder1).add(folder2);
        ((Composite) folder2).add(folder3);
        ((Composite) folder1).add(Img1);
        ((Composite) folder2).add(Img2);
        ((Composite) folder2).add(text3);
        ((Composite) folder2).add(Img3);
        folder1.operation();
    }
}
