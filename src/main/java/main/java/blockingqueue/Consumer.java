package main.java.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * 糖果消费者
 * @author 苏若墨
 */
public class Consumer implements Runnable{
    BlockingQueue<Candy> queue;

    public Consumer(BlockingQueue<Candy> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Candy candy;
            // 获取并处理消息直到接收到“exit”消息
            while (!(candy = queue.take()).getName().equals("exit")) {
                Thread.sleep(100);
                System.out.println("消费糖果： " + candy.getName());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
