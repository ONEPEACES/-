package behavioural_pattern.observer;

import java.util.ArrayList;

public abstract class AllControlCenter {
    /**
     * 战队名称
     * @param
     * @return
     */
    protected String allName;
    protected ArrayList<Observer> players = new ArrayList<>();

    public String getAllName() {
        return allName;
    }

    public void setAllName(String allName) {
        this.allName = allName;
    }

    public void join(Observer observer){
        System.out.println(observer.getName() + "加入" + this.allName + "战队");
        players.add(observer);
    }

    public void quit(Observer observer){
        System.out.println(observer.getName() + "退出" + this.allName + "战队");
        players.remove(observer);
    }

    public abstract void notifyObserver(String name);
}

