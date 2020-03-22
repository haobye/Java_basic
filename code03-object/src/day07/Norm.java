package day07;
/*
一个标准类通常要拥有下面四个组成部分：
(一个标准类也叫做Java Bean)
    1.所有成员变量都要使用private关键字

    2.为每一个成员变量编写一对儿getter/setter方法
        快捷方法：写出private和成员变量--Code--Generate--选择getter/setter--按shift选name和age

    3.编写一个无参数构造方法
        快捷方法：Code--Generate--Constructor(构造器)--Select None(无参数)

    3.编写一个全参数构造方法
        快捷方法：Code--Generate--Constructor(构造器)--按shift选name和age(全参数)
 */
public class Norm {
    private String name;
    private int age;

    public Norm() {
    }

    public Norm(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
