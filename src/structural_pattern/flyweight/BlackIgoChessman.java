package structural_pattern.flyweight;

/**
 *@author Xue
 *@date 2018/7/18 10:16
 *@description  具体享元类，可以具有可共享的内容
 */
public class BlackIgoChessman extends IgoChessman {
    @Override
    public String getColor() {
        return "黑色";
    }
}
