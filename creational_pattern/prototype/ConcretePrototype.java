package creational_pattern.prototype;

public class ConcretePrototype  implements Prototype{
    private String val ;

    public ConcretePrototype(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    /**
     * 浅拷贝，只复制了引用，未拷贝实际内存地址的对象
     * @return
     */
    @Override
    public Prototype clone() {
        return this;
    }
}
