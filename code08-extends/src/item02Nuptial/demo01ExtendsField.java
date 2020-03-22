package item02Nuptial;
/*
再父子类的继承关系中，如果成员变量重名，则创建子类对象时，有两种方式：

1、直接通过子类对象访问成员变量：
    等号左边是谁，就优先使用谁，没有则向上找。

2、间接通过成员方法访问成员变量：
    该方法属于谁(定义在谁里面)，就优先用谁，没有则向上找。
 */
public class demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        int numfu = fu.numfu;    //父类不知子类，
        System.out.println(numfu);
        System.out.println("========");

        Zi zi = new Zi();
        System.out.println(zi.numfu);   //子类知道父类
        System.out.println(zi.numzi);
        System.out.println("========");

        //等号左边是谁，就优先用谁，zi-->等号左边Zi zi,优先用Zi，即15
        System.out.println(zi.num);
        System.out.println("========");

        //谁定义的就属于谁，就用谁
        zi.methodZi();
        zi.methodFu();
    }
}
