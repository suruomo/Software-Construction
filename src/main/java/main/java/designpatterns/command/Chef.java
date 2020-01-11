package main.java.designpatterns.command;

/**
 * 厨师类（接收者）
 * @author 苏若墨
 */
public class Chef {
    private String name;
    public Chef(String name){
        this.name=name;
    }

    /**
     * 做早餐
     */
    public void cook(){
        System.out.println(name+"正在做早餐...");
    }

}
