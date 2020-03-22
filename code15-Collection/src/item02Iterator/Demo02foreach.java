package item02Iterator;

import java.util.ArrayList;
/*
增强for循环:
    专门用来遍历集合和数组，替代迭代器
    底层使用的也是迭代器,使用for循环的格式,简化了迭代器的书写.是JDK1.5之后出现的新特性

Collection<E>extends Iterable<E>:所有的单列集合都可以使用增强for
public interface Iterable<T>实现这个接口允许对象成为 "foreach" 语句的目标。

格式:
    for(集合/数组的数据类型 变量名: 集合名/数组名){
        System.out.println(变量名);
    }
 */
public class Demo02foreach {
    public static void main(String[] args) {
        eg01array();
        eg02arraylist();
    }

    //使用增强for循环遍历集合
    private static void eg02arraylist() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for(String s : list){
            System.out.println(s);
        }
    }

    //使用增强for循环遍历数组
    private static void eg01array() {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
