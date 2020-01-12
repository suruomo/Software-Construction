package main.java.designpatterns.factory;

/**
 * 工厂类
 * @author 苏若墨
 */
public abstract class CarFactory {

    public Car orderCar(String type){
        Car car;
        car=createCar(type);
        car.prepare();;
        car.finish();
        return car;
    }

    /**
     *工厂方法：创建汽车，每个加盟店（子类）有自己独特的制作方法，让子类决定要创建的对象
     * @param type
     * @return
     */
    protected abstract Car createCar(String type);
}
