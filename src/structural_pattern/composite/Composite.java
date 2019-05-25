package structural_pattern.composite;

import java.util.ArrayList;

public class Composite implements Component {
    private String name;
    private ArrayList<Component> list;

    public Composite(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }

    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        System.out.println("您已经切换到" + this.name + "目录");
        for(Object obj : list){
            ((Component)(obj)).operation();
        }
    }
}
