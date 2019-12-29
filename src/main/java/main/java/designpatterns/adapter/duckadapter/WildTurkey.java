package main.java.designpatterns.adapter.duckadapter;

/**
 * 火鸡具体实现
 * @author 苏若墨
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
