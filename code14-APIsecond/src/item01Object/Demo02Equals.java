package item01Object;

import java.util.ArrayList;

/*
boolean equals(Object obj)  指示其他某个对象是否与此对象“相等”

equals方法源码：
    public boolean equals(Object obj) {
        return (this == obj)
    }
参数：
    Object obj：可以传递任意对象
    == 比较运算符返回一个布尔值 true false
    基本数据类型：比较的是值
    引用数据类型：比较的是两个对象的地址值

this是谁？哪个对象调用的方法，方法中的this就是那个对象的；p1调用的equals方法、所以this就是p1
obj是谁？传递过来的参数p2
 */
public class Demo02Equals {

    public static void main(String[] args) {
        Person p1 = new Person("小明", 18);
//        Person p2 = new Person("小红", 17);
        Person p2 = new Person("小明", 18);
        System.out.println("p1-->"+p1);
        System.out.println("p2-->"+p2);
        //以上两个输出需要将Person中的toString重写注释掉、才能打印出地址值。
        //p1 = p2;  //这是把p2的地址值赋给p1，所以打印true

        //Person中没有类型判断的时候有缺陷，以下会有类型异常错误
        ArrayList<String> list = new ArrayList<>();

        boolean result = p1.equals(list);
//        boolean result = p1.equals(null);
//        boolean result = p1.equals(p2);
        System.out.println(result);
    }

}



