package main.java.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 测试类
 * @author 苏若墨
 */
public class Test {
    public static void main(String[] args) {
        // 创建大小为10的 BlockingQueue
        BlockingQueue<Candy> queue = new ArrayBlockingQueue<Candy>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        // 开启 producer线程
        new Thread(producer).start();
        // 开启 consumer线程
        new Thread(consumer).start();
        System.out.println("Producer and Consumer start.....");
    }
}
