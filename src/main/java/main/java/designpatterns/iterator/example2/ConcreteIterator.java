package main.java.designpatterns.iterator.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器具体实现
 * @author 苏若墨
 */
public class ConcreteIterator implements Iterator {
    private List list = new ArrayList();
    private int cursor =0;
    public ConcreteIterator(List list){
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        if(cursor==list.size()){
            return false;
        }
        return true;
    }
    @Override
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }

}
