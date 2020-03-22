package day06;
/*
一般情况下：一个类不能直接使用，需要根据类创建一个对象，才能使用

1.导包：就是指出需要使用的类，在什么位置
    import 包名称.类名称；
    import day06.demo02class；
    对于和当前类属于同一个包的情况，可以省略导包语句不写。

2.创建：格式
    类名称 对象名 = new 类名称();
    对象名自己取一个

3.使用：分两种情况
    使用成员变量：对象名.成员变量名
    使用成员方法：对象名.成员方法名(参数)

注意事项：
    如果成员变量没有赋值，那么将有一个默认值，规则和数组一样
 */
public class demo03useclass {
    public static void main(String[] args) {
        //1.导包，在同一个包下，可省略

        //2.创建
        demo02class stu = new demo02class();

        //3.使用成员变量
//        System.out.println(stu.name);
//        System.out.println(stu.age);
//        System.out.println("==============");
//        //3.5重新赋值
//        stu.name = "han chong hao";
//        stu.age = 18;       //定义的age为int类型
//        System.out.println(stu.name);
//        System.out.println(stu.age);
//        System.out.println("==============");

        //4.使用成员方法
        stu.eat();
        stu.sleep("你");
        System.out.println("==============");
    }
}
