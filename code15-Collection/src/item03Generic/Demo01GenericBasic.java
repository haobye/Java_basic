package item03Generic;

import java.util.ArrayList;
import java.util.Iterator;
//generic 泛型
public class Demo01GenericBasic {

    public static void main(String[] args) {
//        show01off();
        show02on();
    }

    /*
    创建集合对象，使用泛型
        好处：1、避免类型转换的麻烦，存储的是什么类型，取出就是什么类型。
              2、把运行期异常(代码运行后会抛出的异常)，提升到了编译期(写代码的时候会报错)。
        弊端：泛型是什么类型，只能存储什么类型的数据。
     */
    private static void show02on() {
        ArrayList<String> list = new ArrayList<>();
        list.add("jkl");
        //list.add(9);  //体现第二个好处
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s+"-->"+s.length());
        }
    }


    /*
    创建集合对象，不使用泛型
        好处：集合不适用泛型，默认的类型就是Object类型，可以储存任意类型的数据。
        弊端：不安全，容易引发异常。
     */
    private static void show01off() {
        ArrayList list = new ArrayList();
        list.add("asdf");
        list.add(8);
        //使用迭代器遍历list集合
        //首先获取迭代器
        Iterator it = list.iterator();
        //使用hasNext和next方法遍历
        while(it.hasNext()) {
            //取出元素是Object类型
            Object obj = it.next();
            System.out.println(obj);
            //若是想要使用String类特有的方法length；不能使用，需要向下转型
            //会抛出ClassCastException类型转换异常。8是int类型，不能计算长度
            String s = (String)obj;
            System.out.println(s.length());
        }
    }
}
