package main.java.designpatterns.adapter.duckadapter;

/**
 * @author 苏若墨
 */
public class TestAdapter {
    public static void main(String[] args) {
        //创建一头绿头鸭和火鸡
        MallarDuck mallarDuck=new MallarDuck();
        WildTurkey wildTurkey=new WildTurkey();
        //将火鸡包装进适配器中，看起来像鸭子
        Duck turkeyAdapter=new TurkeyAdapter(wildTurkey);
        System.out.println("WildTurkey says:");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println("MallarDuck says:");
        testDuck(mallarDuck);
        System.out.println("TurkeyAdapter says:");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
