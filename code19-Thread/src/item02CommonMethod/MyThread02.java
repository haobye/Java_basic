package item02CommonMethod;

public class MyThread02 extends Thread {

    //第一种方法
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    //第二种方法
    public MyThread02() {}

    public MyThread02(String name) {
        super(name);  //把线程名称传给父类，让父类(Thread)给线程起一个名字
    }

}
