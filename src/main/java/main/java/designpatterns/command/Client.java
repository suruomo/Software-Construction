package main.java.designpatterns.command;

/**
 * 测试类
 * @author 苏若墨
 */
public class Client {
    public static void main(String[] args) {
        //调用者，传入命令对象，发出请求
        Waiter waiter=new Waiter();
        //请求的接收者
        Chef chef=new Chef("Mike");
        //命令对象，将接收者传给他
        CookCommand cookCommand=new CookCommand(chef);
        //将命令传递给调用者
        //设置命令对象
        waiter.setCommand(cookCommand);
        //按下按钮，发出请求
        System.out.println(waiter);
        waiter.executeCommand();
    }
}
