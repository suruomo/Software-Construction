package main.java.designpatterns.adapter.duckadapter;

/**
 * 火鸡适配器：用火鸡对象冒充鸭子对象
 * @author 苏若墨
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey=turkey;
    }
    @Override
    public void quack() {
       turkey.gobble();
    }

    @Override
    public void fly() {
       turkey.fly();
    }
}
