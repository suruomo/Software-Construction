package main.java.designpatterns.factory;

/**
 * 比亚迪公司
 * @author 苏若墨
 */
public class BydFactory extends CarFactory {
    /**
     *
     * @param type
     * @return
     */
    @Override
    protected Car createCar(String type) {
        return new Byd();
    }
}
