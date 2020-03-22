package item07StructureSuper;
/*
constructor 构造方法
Structure  构造

继承关系中，父子类构造方法的访问特点：
    1.子类构造方法当中有一个默认隐含的super()调用，所以一定先调父类，再子类。
    2.子类构造方法可以通过super关键字来调用父类重载构造。
    3.super的父类构造调用，必须是子类中的第一句。子类不能调用多次super。
    总结：
    子类必须调用父类构造方法，不写则赠送super()，写了则用指定的super调用。
    super只能有一个，还必须是写在第一个的。

 */
public class demo01Constructor {

    public static void main(String[] args) {
        Zi zi = new Zi();
    }

}
