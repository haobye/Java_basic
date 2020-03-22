package item01Class;
/*
使用final修饰一个类的格式：
public final class 类名称 {
    //方法体
}

含义：一旦使用final则不能有子类(太监类)。
注意：其中的方法也不能被覆盖重写(因为没有儿子)。
 */
public final class MyClass /*extends Object*/{

    public void method() {
        System.out.println("方法执行");
    }

}
