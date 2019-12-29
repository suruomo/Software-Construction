package main.java.designpatterns.iterator.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 苏若墨
 */
public class Test {
    public static void main(String[] args) {
        List list=new ArrayList<Integer>(10);
        IUserDefinedList iUserDefinedList=new IUser(10);
        for(int i=0;i<10;i++){
            list.add(i);
            iUserDefinedList.add(i);
        }
        // 自定义List
        for (int i = 0, len = iUserDefinedList.length(); i < len; i++) {
            System.out.println(iUserDefinedList.getElement(i));
        }
        // java.util.List
        for (int i = 0, size = list.size(); i < size; i++) {
            System.out.println(list.get(i));
        }
    }
}
