package structural_pattern.composite;

public class ImgLeaf implements Component {
    private String name;

    public ImgLeaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("您扫描到" + this.name +" 图片格式文件");
    }
}
