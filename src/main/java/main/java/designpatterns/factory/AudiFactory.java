package main.java.designpatterns.factory;

/**
 * 奥迪工厂
 * @author 苏若墨
 */
public class AudiFactory extends CarFactory {
    /**
     * 创建汽车，可以有很多种不同的子类创建方法，在此只列举了一种
     * @param type
     * @return
     */
    @Override
    protected Car createCar(String type) {
        return new Audi();
    }
}