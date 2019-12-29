package main.java.vehicle;

/**
 *
 * @author 苏若墨
 */
public class Car  implements Vehicle {

    private String name;

    private int capacity;

    public Car(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("1.点火");
        System.out.println("2.挂挡");
        System.out.println("3.松手刹，松脚刹");
        System.out.println("4.踩油门");
        System.out.println("5.起步");

    }

    @Override
    public void stop() {
        System.out.println("1.踩刹车");
        System.out.println("2.拉手刹");
        System.out.println("3.挂p挡");
        System.out.println("4.熄火");
        System.out.println("5.拔钥匙");
    }

    /**
     * Two objects are considered equal if they have the same name and the same capacity
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
      if(!(o instanceof Car)){
          return false;
      }
      Car car=(Car) o;
      return (this.name.equals(car.name))&&(this.capacity==car.capacity);
    }

    @Override
    public int hashCode() {
        return this.capacity;
    }
}
