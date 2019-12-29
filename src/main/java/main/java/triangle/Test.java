package main.java.triangle;

/**
 * @author 苏若墨
 */
public class Test {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(-1,-3,-4);
        System.out.println("面积是："+triangle.getArea());
        System.out.println("周长是："+triangle.getPerimeter());
    }
}
