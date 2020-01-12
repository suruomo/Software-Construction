package main.java.designpatterns.factory;


/**
 * 产品类：Car
 * @author 苏若墨
 */
public class Car {
    /**
     * 汽车名称
     */
     String name;
    /**
     * 颜色
     */
     String color;


    /**
     * 准备工作
     */
    public void prepare(){
        System.out.println("准备 "+name);
        System.out.println("设计...");
        System.out.println("上色..."+color);
        System.out.println("装配...");
    }

    /**
     * 完成工作
     */
    public void finish(){
        System.out.println("完成"+name);
    }


    /**
     * 返回姓名
     * @return
     */
    public String getName(){
        return name;
    }
}
