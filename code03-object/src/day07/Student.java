package day07;
/*
构造方法是专门用来创建对象的方法，通过关键字new创建对象时，其实就是调用调用方法
格式：
public 类名称(参数类型 参数名称) {
    方法体
}

注意事项：
    1.构造方法的类名称必须和所在类的名称完全一样，包括大小写
    2.构造方法不要写返回值，连void都不要写
    3.构造方法不能return一个具体的返回值
    4.如果没有编写任何构造方法，编译器默认赠送一个没有参数、方法体什么都不做的构造方法
        public Student() {}
    5.一旦编写了至少一个构造方法，那么编译器将不再赠送
    6.构造方法也可以进行重载(方法名称相同，参数列表不同)。
 */
public class Student {
    private String name;
    private int age;

    //无参数构造方法
    public Student() {
        System.out.println("无参数构造方法执行啦！！！");
    }
    //全参数构造方法（重载）
    public Student(String name, int age) {
        System.out.println("全参数构造方法执行啦！！！");
        this.name = name;
        this.age = age;
    }

    //getter/setter
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
