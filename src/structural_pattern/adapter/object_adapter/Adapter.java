package structural_pattern.adapter.object_adapter;

public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(){
        adaptee = new Adaptee();
    }

    /**
     * 用于给客户端提供调用的接口，实际上使用的使adaptee的specialRequest()方法
     * @param
     * @return
     */
    @Override
    public void request() {
        adaptee.specialRequest();
    }


}
