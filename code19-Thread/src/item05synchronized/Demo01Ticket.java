package item05synchronized;
/*
synchronized 同步锁🔒       第一种方案

模拟卖票案例：创建3个线程,同时开启,对共享的票进行出售
 */
public class Demo01Ticket {
    public static void main(String[] args) {

        RunnableImpl run = new RunnableImpl();

        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();
    }
}
