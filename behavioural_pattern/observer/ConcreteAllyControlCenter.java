package behavioural_pattern.observer;

public class ConcreteAllyControlCenter extends AllControlCenter {

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("----------------------------");
        this.allName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
        for (Object object : this.players) {
            //不显示自己救自己的信息
            if (!((Observer) object).getName().equalsIgnoreCase(name)) {
                ((Observer) object).help();
            }
        }

    }
}
