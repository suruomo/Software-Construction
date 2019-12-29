package main.java.triangle;

/**
 * 三角形
 * @author 苏若墨
 */
public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        check();
    }

    private void check() {
        if(a<0||b<0||c<0){
            throw new IllegalArgumentException("三角形边为负数不合法！");
        }
        if((a+b<c)||(a+c<b)||(b+c<a)){
            throw new IllegalArgumentException("三角形边长度不合法！");
        }
    }

    /**
     * 求周长
     * @return
     */
    public double getPerimeter(){
        return this.a+this.b+this.c;
    }

    /**
     * 求面积：海伦公式
     * @return
     */
    public double getArea(){
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
