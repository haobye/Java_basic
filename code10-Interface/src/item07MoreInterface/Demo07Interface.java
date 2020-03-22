package item07MoreInterface;
/*
使用接口的时候，需要注意：

1、接口没有静态代码块或者构造方法。

2、一个类的直接父类是唯一的，但是一个类可以同时实现多个接口。
格式：
    public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {
        //覆盖重写所有抽象方法
    }

3、如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。

4、如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类。(在本类public后加abstract)

5、如果实现类实现的多个接口当中，存在重复的默认方法，那么实现类【一定】要对【冲突】的默认方法进行覆盖重写。

6、一个类如果 直接父类 当中的方法，和接口当中的默认方法产生了冲突，优先使用父类中的。
 */
public class Demo07Interface {

    public static void main(String[] args) {
        MyInterfaceImplement impl = new MyInterfaceImplement();
        impl.methodA();
        impl.methodB();
        impl.methodAbs();
        System.out.println("=====");

        //尝试第六点
        Zi zi = new Zi();
        zi.method();
    }

}
