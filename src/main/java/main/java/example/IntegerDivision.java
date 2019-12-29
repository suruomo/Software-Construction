package main.java.example;

import java.util.Scanner;

/**
 * 整数划分（递归）
 * @author 苏若墨
 */
public class IntegerDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入待划分整数n和最大划分整数m：");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("可划分数："+division(n,m));
    }

    private static int division(int n, int m) {
        if((n<1)||(m<1)) {
            return 1;
        }
        if(n<m){
            return division(n,n);
        }
        if(n==m){
            return 1+division(n,m-1);
        }
        return division(n,m-1)+division(n-m,m);


    }
}
