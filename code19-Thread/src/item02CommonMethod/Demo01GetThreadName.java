package item02CommonMethod;
/*
获取线程的名称:
    1.使用Thread类中的方法getName()
        String getName() 返回该线程的名称。
    2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
        static Thread currentThread() 返回对当前正在执行的线程对象的引用。

线程的名称:
    主线程: main
    新线程: Thread-0,Thread-1,Thread-2,……
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        //创建Thread的子类对象
        MyThread01 mt = new MyThread01();
        //开启新线程（新线程名称）
        mt.start();                 //Thread-0

        new MyThread01().start();    //Thread-1
        new MyThread01().start();    //Thread-2

        //获取主线程名称
        System.out.println("主线程名称："+Thread.currentThread().getName());
    }
}
