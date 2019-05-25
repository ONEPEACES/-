package behavioural_pattern.observer;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        AllControlCenter acc = new ConcreteAllyControlCenter("金庸群侠");

        Observer observer1, observer2, observer3, observer4;
        observer1 = new Player("杨过");
        acc.join(observer1);
        observer2 = new Player("令狐冲");
        acc.join(observer2);
        observer3 = new Player("张无忌");
        acc.join(observer3);
        observer4 = new Player("段誉");
        acc.join(observer4);

        observer1.beAttacked(acc);
        observer2.beAttacked(acc);
    }
}
