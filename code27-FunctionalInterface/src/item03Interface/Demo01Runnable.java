package item03Interface;
/*
函数式接口作为【方法的参数】 案例：

    例如java.lang.Runnable接口就是一个函数式接口，
    假设有一个startThread方法使用该接口作为参数，那么就可以使用Lambda进行传参。
    这种情况其实和Thread类的构造方法参数为Runnable没有本质区别。
 */
public class Demo01Runnable {
    //定义一个方法startThread，方法的参数使用函数式接口Runnable
    public static void startThread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //调用startThread方法，它的参数是函数式接口，我们可以传递匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " --> 线程启动啦");
            }
        });

        //我们可以传递Lambda表达式
        startThread(() -> {
            System.out.println(Thread.currentThread().getName() + " --> 线程启动");
        });

        //使用Lambda表达式
        startThread(() -> System.out.println(Thread.currentThread().getName() + " === 启动"));
    }
}
