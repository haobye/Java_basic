package item01static;
/*
如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它

一旦使用static关键字修饰成员方法，它就成为静态方法，它不属于对象，而是属于类的。
不需要创建对象，直接通过类名称调用

注意事项：
    1.静态不能直接访问非静态。
        原因：因为在内存当中是【先】有静态内容，【后】有的非静态内容。
        “先人不知道后人，但是后人知道先人”。
    2.静态方法当中不能用this。
        原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。
 */
public class demo03StaticMethod {
    public static void main(String[] args) {

        MyClass my = new MyClass();
        my.method();
        System.out.println("=======");

        my.staticMethod(); //正确，不推荐
        MyClass.staticMethod();  //正确，推荐
    }
}
