package item04MultithreadingSafe;
/*
实现买票案例
 */
public class RunnableImpl implements Runnable {       //实现Runnable
    //定义一个多线程共享的票源
    private int ticket = 100;

    //重写run方法，设置线程任务：买票
    @Override
    public void run() {
        //使用死循环，将票卖完
        while(true){
            //提高安全漏洞出现的概率,让程序睡眠10毫秒
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //先判断是否有票
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName()+"--为您售卖第"+ticket+"张电影票");
                ticket--;  //每卖出一张，则票源减一
            }
        }

    }
}
