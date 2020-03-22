package item01static;

public class MyClass {

    int num;  //成员变量
    static int id;  //静态变量

    public void method() {
        System.out.println("这是一个成员方法");
    }

    public static void staticMethod() {
        System.out.println("这是一个静态方法");
        System.out.println(id);   //静态可以访问静态变量
//        System.out.println(num);  //静态不能直接访问非静态，错误写法
//        System.out.println(this);  //错误写法
    }

}
