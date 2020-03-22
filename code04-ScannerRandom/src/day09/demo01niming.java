package day09;
/*
创建对象的标准格式：类名称 对象名 = new 类名称()；
匿名函数的格式：只有右边的对象，没有左边的名字和赋值运算符
            new 类名称()；

匿名函数只能使用唯一的一次，下次再用必须再创建一个
 */
public class demo01niming {
    public static void main(String[] args) {
        //标准格式
        Person man = new Person();
        man.name = "韩";
        man.show();
        System.out.println("==========");

        //匿名函数
        new Person().name = "浩";
        new Person().show();    //null
    }
}
