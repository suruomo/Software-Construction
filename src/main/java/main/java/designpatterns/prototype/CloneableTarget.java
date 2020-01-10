package main.java.designpatterns.prototype;

import java.io.Serializable;

/**
 * 克隆目标对象
 * @author 苏若墨
 */
public class CloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;
    /**
     * 克隆姓名
     */
    private String cloneName;
    /**
     * 年龄
     */
    private int age;

    private String cloneClass;

    public CloneableTarget(String cloneName, int age, String cloneClass) {
        this.cloneName = cloneName;
        this.age = age;
        this.cloneClass = cloneClass;
    }

    public CloneableTarget(String mike, int i) {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
