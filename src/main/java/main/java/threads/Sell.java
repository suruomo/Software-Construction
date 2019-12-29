package main.java.threads;
/**
 *  Thread safety argument
 *  --------------------------
 *  The threads in the system are:
 *  - main thread accepting new connections
 *  - one thread sale-tickets
 *
 *  The serverSocket object is confined to the main thread.
 *
 *  One ticket sale is confined to that sale-tickets's thread;
 *  the main thread loses its reference to the object right after starting
 *  the sale-tickets thread.
 *
 *  Create three ticketing threads are confined to the main thread
 *  during creation and then immutable after creation.
 *
 *  System.err is used by all threads for displaying error messages.
 *  No other shared mutable data.
 */
class SaleTicket implements Runnable{
    private int tickets = 20;
    @Override
    public void run(){
        while(tickets > 0){
            synchronized (SaleTicket.class){
                if(tickets > 0){
                    System.out.println(Thread.currentThread().getName() + "卖出 第 "+ (tickets--)+"张票");
                    try{
                        Thread.sleep(200);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

 class Sell {
    public static void main(String[] args){
        SaleTicket st = new SaleTicket();
        Thread t1 = new Thread(st, "一号窗口");
        Thread t2 = new Thread(st, "二号窗口");
        Thread t3 = new Thread(st, "三号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}