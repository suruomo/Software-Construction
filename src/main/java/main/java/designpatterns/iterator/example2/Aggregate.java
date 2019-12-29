package main.java.designpatterns.iterator.example2;

/**
 * 抽象容器接口
 * @author 苏若墨
 */
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator iterator();

}
