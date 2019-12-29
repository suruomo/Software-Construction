package main.java.vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 苏若墨
 */
public class Bicycle implements Vehicle{
    private List<Integer> list;
    private double weight;
    private double price;

    public Bicycle(double weight, double price) {
        this.list =new ArrayList<>();
        this.weight = weight;
        this.price = price;
    }
    public void add(int sum){
        list.add(sum);
    }

    /**
     * Determine if bicycle variable lists are equal
     * @param bicycle
     * @return
     */
    public boolean similar(Bicycle bicycle){
        List<Integer> list1=bicycle.list;
        if(this.list.size()!=list1.size()){
            return false;
        }
        else{
           for(int i=0;i<list1.size();i++){
               if(!list1.get(i).equals(list.get(i))){
                   return false;
               }
           }
        }
        return true;
    }

    @Override
    public void start() {
        System.out.println("1.上车");
        System.out.println("2.握紧车把");
        System.out.println("3.蹬脚蹬");
        System.out.println("4.出发");
    }

    @Override
    public void stop() {
        System.out.println("1.刹车");
        System.out.println("2.下车");
        System.out.println("3.松开车把");
    }
}
