package main.java.designpatterns.iterator.example1;

/**
 * @author 苏若墨
 */
public class IUser implements IUserDefinedList {
    private Object[] elements;
    private int count;
    public IUser(Integer size) {
        this.elements = new Object[size];
        count=0;
    }

    @Override
    public void add(Object o){
        this.elements[count++]=o;
    }

    @Override
    public int length() {
        return elements.length;
    }

    @Override
    public Object getElement(int index) {
        return elements[index];
    }
}
