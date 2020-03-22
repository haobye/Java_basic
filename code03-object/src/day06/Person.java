package day06;
/*
问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来
解决方案：用private关键字将需要保护的成员变量进行修饰

一旦使用private进行修饰，那么本类中任然可以随意访问。
但是、产出本类的范围就不能直接访问啦

间接访问private成员变量，就是定义一对Getter/Setter方法，有格式固定
 */
public class Person {

    String name;
//    int age;
    private int age;

    //方法没有关键字static
    public void show() {
        System.out.println("我是" + name + "，今年" + age + "岁。");
    }

    //这个成员方法，专门向age设置数据
    //方法名必须为setAge（set不可以改变，将age的首字母大写）
    //有参数，无返回值
    //然后可以增加一些条件用于限制
    public void setAge(int num) {
        if (num <= 150 && num > 0){
            age = num;
        } else {
            System.out.println("年龄不合理");
        }
    }
    //这个成员方法，专门获取age的数据
    //方法名必须为getAge（get不可以改变，将age的首字母大写）
    //无参数，有返回值
    public int getAge() {
        return age;
    }
}
