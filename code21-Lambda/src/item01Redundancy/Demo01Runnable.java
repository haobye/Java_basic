package item01Redundancy;
/*
redundancy 冗余

使用实现Runnable接口的方式实现多线程程序
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        //创建Runnable接口的实现类
        RunnableImpl run = new RunnableImpl();
        //创建线程对象，传入接口的实现类
        Thread t = new Thread(run);
        //调用start方法，开启线程
        t.start();

        //简化以上代码：使用匿名内部类，实现多线程程序
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"--新线程创建啦");
            }
        };
        new Thread(r).start();

        //再次简化代码
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"--新线程创建喽");
            }
        }).start();
    }
}
