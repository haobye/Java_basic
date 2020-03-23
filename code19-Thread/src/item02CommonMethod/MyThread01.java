package item02CommonMethod;

//定义一个Thread的子类
public class MyThread01 extends Thread {

    //重写Thread类中的run方法，设置线程任务
    @Override
    public void run() {
//        //获取线程名称，第一种
//        String name = getName();
//        System.out.println(name);

//        //获取线程名称，第二种
//        Thread t = Thread.currentThread();
//        System.out.println(t);
//        String name = t.getName();
//        System.out.println(name);

        //获取线程名称，第二种，简单的链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
