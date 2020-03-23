package item01ThreadState;
/*
【等待唤醒】案例：   线程之间的【通信communication】
    创建一个顾客线程(消费者):告知老板要的包子的种类和数量,调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
    创建一个老板线程(生产者):花了5秒做包子,做好包子之后,调用notify方法,唤醒顾客吃包子

注意:
    顾客和老板线程必须使用同步代码块包裹起来,保证等待和唤醒只能有一个在执行
    同步使用的锁对象必须保证唯一，只有锁对象才能调用wait和notify方法

方法：
    【void wait()】：在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
    【void notify()】：唤醒在此对象监视器上等待的单个线程。会继续执行wait方法之后的代码
 */
public class Demo01WaitNotify {
    public static void main(String[] args) {
        //1、创建一个锁对象，保证唯一
        Object obj = new Object();

        //2、使用匿名函数创建一个顾客线程(消费者)
        new Thread(){
            //3、重写run方法
            @Override
            public void run() {
                //13、一直等着买包子
                while (true){
                    //4、使用同步技术，保证等待和唤醒只能有一个在执行
                    synchronized (obj){
                        System.out.println("告知老板要的包子的种类和数量");
                        //5、调用wait方法，进入等待模式
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //11、唤醒之后的代码继续执行
                        System.out.println("开始吃包子...");
                        System.out.println("----------------------------");
                    }
                }
            }
        }.start();

        //6、使用匿名函数创建一个老板线程(生产者)
        new Thread(){
            //7、重写run方法
            @Override
            public void run() {
                //14、一直做包子
                while(true){
                    //8、花费5秒钟做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //9、使用同步技术，保证等待和唤醒只能有一个在执行
                    synchronized (obj){
                        System.out.println("老板花费五秒做好包子");
                        //10、调用notify方法，唤醒线程
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
