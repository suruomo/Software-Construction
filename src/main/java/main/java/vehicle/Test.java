package main.java.vehicle;

/**
 * @author 苏若墨
 */
public class Test {
    public static void main(String[] args) {
        Bicycle bicycle1=new Bicycle(50,1000);
        Bicycle bicycle2=new Bicycle(60,1000);
        Bicycle bicycle3=new Bicycle(60,1000);
        Car car1=new Car("奔驰",4);
        Car car2=new Car("大众",4);
        Car car3=new Car("大众",4);
        bicycle1.add(1);
        bicycle2.add(2);
        bicycle3.add(3);
        System.out.println("Cat start:");
        car1.start();
        System.out.println("Bicycle start:");
        bicycle1.start();
        System.out.println("Cat stop:");
        car1.stop();
        System.out.println("Bicycle stop:");
        bicycle1.stop();
        System.out.println("判断Car是否相等");
        System.out.println(car2.equals(car3));
        System.out.println("判断Bicycle是否相等");
        System.out.println(bicycle2.equals(bicycle3));
        System.out.println(bicycle2.similar(bicycle3));
    }
}
