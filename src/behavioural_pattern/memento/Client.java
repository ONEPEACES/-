package behavioural_pattern.memento;

public class Client {
    public static void main(String[] args) {
        //通过备忘录管理者来进行获取备忘录
        //防止其他对象直接获取到备忘录对象从而修改了历史记录
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        Chessman chessman = new Chessman("车",1,1);
        mementoCaretaker.setChessmanMemento(chessman.save());
        chessman.setY(3);
        chessman.restore(mementoCaretaker.getChessmanMemento());
    }
}
