package item03hashCode;
/*
哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来得到地址,不是数据实际存储的物理地址)
在Object类有一个方法,可以获取对象的哈希值
int hashCode() 返回该对象的哈希码值。

hashCode方法的源码:
    public native int hashCode();
    native:代表该方法调用的是本地操作系统的方法
 */
public class Demo01hashCode {
    public static void main(String[] args) {
        //Person类继承了Object类,所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);  //205125520    //7

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);  //1911006827    //7


        //toString方法的源码：return getClass().getName() + "@" + Integer.toHexString(hashCode());
        System.out.println(p1);  //item03hashCode.Person@c39f790    //item03hashCode.Person@7
        System.out.println(p2);  //item03hashCode.Person@71e7a66b    //item03hashCode.Person@7
        System.out.println(p1 == p2);  //false    //false


        System.out.println("-----------------------------");
        //String类的哈希值：String类重写Obejct类的hashCode方法
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());  //96354
        System.out.println(s2.hashCode());  //96354
        System.out.println(s1.hashCode() == s2.hashCode());  //true

        System.out.println("--------------特殊--------------");
        System.out.println("重地".hashCode());  //1179395
        System.out.println("通话".hashCode());  //1179395
        //这两个是一个巧合
    }
}
