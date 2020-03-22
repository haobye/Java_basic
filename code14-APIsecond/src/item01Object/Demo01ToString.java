package item01Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
java.lang.Object
类Object是类层次组织结构的根(父)类。
每个类都使用Object作为超(父)类。
所有对象(包括数组)都实现这个类的方法。
 */
public class Demo01ToString {

    public static void main(String[] args) {
        /*
        Person类默认继承Object类，所以可以是用toString方法，
        String toString() 放回该对象的字符串表示。
         */
        Person p = new Person("小明", 18);

        String s = p.toString();
        System.out.println(s);    //item01Object.Person@2ac1fdc4  / abc  /  person:name=小明,age=18  /  Person{name='小明', age=18}

        /*直接打印对象的名字，就是调用对象的toString*/
        System.out.println(p);    //item01Object.Person@2ac1fdc4  / abc  /  person:name=小明,age=18  /  Person{name='小明', age=18}


        System.out.println("******");
        /*
        看一个类是否重写啦，直接打印这个类的对象即可，
        如果没有重写toString，那么打印的是这个对象的地址值。
         */
        Random r = new Random();
        System.out.println(r);    //没有重写

        Scanner sc = new Scanner(System.in); //键盘输入
        System.out.println(sc);   //重写啦

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);   //重写啦
    }

}
