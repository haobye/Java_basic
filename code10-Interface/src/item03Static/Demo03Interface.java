package item03Static;

public class Demo03Interface {

    public static void main(String[] args) {
        //创建对象
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
        //错误写法
        //impl.method();

        //直接通过接口调用静态方法
        MyInterfaceStatic.method();
    }

}
