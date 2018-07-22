package behavioural_pattern.observer;

public interface Observer {
    public String getName();
    public void setName(String name);
    /**
     * 声明支援盟友的方法
     * @param
     * @return
     */
    public void help();

    public void beAttacked(AllControlCenter acc);
}
