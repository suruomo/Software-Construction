package main.java.example;

import java.util.Scanner;

/**HailStone实现
 * Problem:给定任意自然数n，求解H(n)序列中的峰值。
 * @author 苏若墨
 */
public class HailStone {
    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入任意自然数n:");
        n=sc.nextInt();
        System.out.println("该H(n)序列中的峰值是："+hailstone(n));
    }

    private static int hailstone(int n) {
        int max=0;
        while(n!=1){
            System.out.printf(n+" ");
            max=Math.max(n,max);
            n=n%2==0?n/2:3*n+1;
        }
        System.out.println(1);
        return max;
    }
}
