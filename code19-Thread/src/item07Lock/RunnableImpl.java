package item07Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
卖票案例出现了线程安全问题
卖出了不存在的票和重复的票

解决线程安全问题的【第三种】方案:使用Lock锁
    Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。

Lock接口中的方法:
    void lock() 获取锁。
    void unlock()  释放锁。

使用步骤:
    1.在成员位置创建一个ReentrantLock对象
    2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
    3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
    （）
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;

    Lock l = new ReentrantLock();   //创建ReentrantLock对象

    //将释放unlock锁放在finally中，可以有效避免损失
    @Override
    public void run() {
        while(true){
            l.lock();    //调用Lock锁

            if(ticket > 0){
                try {
                    Thread.sleep(20);
                    //将售票一同放入try中
                    System.out.println(Thread.currentThread().getName()+"--正在为您出售第"+ticket+"张票...");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally{
                    l.unlock();   //释放unlock锁  //无论程序是否异常，都会把锁释放掉
                }
            }
        }
    }


    /*@Override
    public void run() {
        while(true){
            l.lock();    //调用Lock锁

            if(ticket > 0){
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+"--正在为您出售第"+ticket+"张票...");
                ticket--;
            }

            l.unlock();   //释放unlock锁
        }
    }*/
}
