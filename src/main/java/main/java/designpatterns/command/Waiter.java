package main.java.designpatterns.command;

import java.util.Arrays;

/**
 * 服务员（调用者）
 * @author 苏若墨
 */
public class Waiter {

    Command command;

    public Waiter(){
    }

    /**
     * 设置命令对象
     */
    public void setCommand(Command cookCommand){
        command=cookCommand;
    }

    /**
     * 执行命令
     */
    public void executeCommand(){
        command.execute();
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "command=" + command +
                '}';
    }
}
