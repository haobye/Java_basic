package item03MultiMethod;
/*
在多态的代码当中，
成员方法的访问规则是：
        看new的是谁，就优先用谁，没有则向上找。

成员方法口诀：编译看左边，运行看右边。

对比一下：
成员方法口诀：编译看左边，运行还看左边。
 */
public class Demo03MultiMethod {

    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();//new的是Zi，所以优先
        obj.methodFu();//子类没有，向上找父类

        //编译看左边，左边是Fu，Fu当中没有methodZi方法，所以报错
//        obj.methodZi();//错误写法
    }

}
