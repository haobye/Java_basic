package item03ThreadPool;
/*
步骤二：实现Runnable接口，重写run方法
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--创建一个新的线程执行");
    }
}
