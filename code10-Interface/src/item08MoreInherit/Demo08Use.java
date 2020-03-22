package item08MoreInherit;
/*
1、类与类之间是单继承的。直接父类只有一个。
2、类与接口之间是多实现的。一个类可以实现多个接口。
3、接口与接口直接按是多继承的。

注意事项：
    1、多个父接口当中的【抽象】方法如果重复，没关系。
    2、多个父接口当中的【默认】方法如果重复，
        那么子接口必须进行默认方法的覆盖重写，【而且带着default关键字】。
 */
public class Demo08Use {

    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodDefault();
    }

}
