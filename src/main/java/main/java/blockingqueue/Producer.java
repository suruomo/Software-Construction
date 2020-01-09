package main.java.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * 糖果生产者
 * @author 苏若墨
 */
public class Producer implements Runnable{
    BlockingQueue<Candy> queue;

    public Producer(BlockingQueue<Candy> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        // 生产糖果
        for (int i = 0; i < 100; i++) {
            Candy candy = new Candy("" + i);
            try {
                Thread.sleep(100);
                queue.put(candy);
                System.out.println("生产糖果： " + candy.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 添加退出消息
        Candy candy = new Candy("exit");
        try {
            queue.put(candy);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
