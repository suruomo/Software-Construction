package main.java.designpatterns.command;

/**
 * 实现厨师接受命令做早餐类
 * @author 苏若墨
 */
public class CookCommand implements Command {
    Chef chef;
    public CookCommand(Chef chef){
        this.chef=chef;
    }

    @Override
    public void execute() {
        chef.cook();
    }
}
