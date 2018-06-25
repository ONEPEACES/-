package creational_pattern.singleton;

public class Singleton {
    //保证主内存中单例实例是最新值
    private static volatile Singleton instance = null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
