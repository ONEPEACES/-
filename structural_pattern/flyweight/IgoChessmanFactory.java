package structural_pattern.flyweight;

import java.util.Hashtable;

/**
 *@author Xue
 *@date 2018/7/18 10:13
 *@description  使用了单例模式，保证系统中享元类的个数
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable<String,IgoChessman> ht;

    private IgoChessmanFactory(){
        ht = new Hashtable<>();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        ht.put("b",black);
        white = new WhiteIgoChessman();
        ht.put("w",white);
    }

    public static IgoChessmanFactory getInstance(){
        return instance;
    }

    public IgoChessman getIgoChessman(String color){
        return ht.get(color);
    }
}
