package main.java.designpatterns.iterator.example1;

/**
 * 自定义集合
 * @author 苏若墨
 */
public interface IUserDefinedList {

    int length();

    Object getElement(int index);

    void add(Object o);
}
