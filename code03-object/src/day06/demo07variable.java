package day06;
/*
局部变量 和 成员变量

1.定义位置不一样
局部：在方法的内部
成员：在方法的外部，直接写在类当中

2.作用范围不一样
局部：只在方法中使用
成员：整个类全都可以使用

3.默认值不一样
局部：没有默认值，想使用必须进行赋值
成员：没有赋值时会有默认值，规则和数组一样

4.内存位置不同
局部：位于栈内存
成员：位于堆内存

5.生命周期不同
 */
public class demo07variable {
    String name;

    public void methodA() {
        int age = 18;
        System.out.println(age);
        System.out.println(name);
    }

    public void methodB() {
        int age;
        //System.out.println(age);    //局部变量必须赋值才能使用，否则报错
        System.out.println(name);
    }

    public void methodC(int param) {    //方法的参数必然是局部变量
        System.out.println(param);      //参数在被调用时会被赋值
    }
}
