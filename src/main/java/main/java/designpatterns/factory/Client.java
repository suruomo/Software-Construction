package main.java.designpatterns.factory;

/**
 * 测试类
 * @author 苏若墨
 */
public class Client {
    public static void main(String[] args) {
        //分别建立奥迪公司和比亚迪公司
        CarFactory audiFactory=new AudiFactory();
        CarFactory bydFactory=new BydFactory();
        Car car=audiFactory.orderCar("Audi");
        System.out.println("Ethan orderes a "+car.getName());
        car=bydFactory.orderCar("Byd");
        System.out.println("Joe orderes a "+car.getName());
    }
}
