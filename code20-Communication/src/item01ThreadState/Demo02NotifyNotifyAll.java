package item01ThreadState;
/*
进入到TimeWaiting(计时等待)有两种方式：
    1.使用sleep(long m)方法,在毫秒值结束之后,线程睡醒进入到 Runnable/Blocked(可运行/阻塞) 状态。
    2.使用wait(long m)方法,wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态。

唤醒的方法：
    void notify() 唤醒在此对象监视器上等待的单个线程。
    void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 */
public class Demo02NotifyNotifyAll {
    public static void main(String[] args) {
        Object obj = new Object();

        //顾客1
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        try {
                            //obj.wait(5000);   //相当于sleep方法啦
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("开始吃包子...");
                        System.out.println("----------------------------");
                    }
                }
            }
        }.start();

        //顾客2
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("开始吃包子...");
                        System.out.println("----------------------------");
                    }
                }
            }
        }.start();

        //老板
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);//花5秒钟做包子
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("老板5秒钟之后做好包子,告知顾客,可以吃包子了");
//                        obj.notify();   //如果有多个等待线程,随机唤醒一个
                        obj.notifyAll();  //唤醒所有等待的线程
                    }
                }
            }
        }.start();
    }
}
