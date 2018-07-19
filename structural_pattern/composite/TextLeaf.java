package structural_pattern.composite;

public class TextLeaf implements Component {

    private String name;

    public TextLeaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("您扫描到" + this.name +" 文本格式文件");
    }
}
