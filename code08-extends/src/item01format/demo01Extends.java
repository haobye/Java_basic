package item01format;
/*
在继承的关系中，“子类就是一个父类”，也就是说，子类也可以被当作父类看待。
例如：父类是员工employee，子类是讲师teacher，那么“讲师就是一个员工”。

1、定义父类格式：
    public class 父类名称{
        //……
    }

2、定义子类格式：
    public class 子类名称 extends 父类名称{
        //……
    }
 */
public class demo01Extends {
    public static void main(String[] args) {

        //创建一个子类对象，虽然teacher类中什么都没有，但是它继承父类的method
        Teacher teacher = new Teacher();
        teacher.method();

        //再创建一个子类对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
