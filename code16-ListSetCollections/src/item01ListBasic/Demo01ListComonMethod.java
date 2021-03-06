package item01ListBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
java.util.List接口 extends Collection接口
List接口的特点:
    1.有序的集合,存储元素和取出元素的顺序是一致的(存储123 取出123)
    2.有索引,包含了一些带索引的方法
    3.允许存储重复的元素

【List接口中带索引的方法(特有)，以下四种分别举例】
    - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
    - public E get(int index):返回集合中指定位置的元素。
    - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
    - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。

注意:
    操作索引的时候,一定要防止索引越界异常
    IndexOutOfBoundsException:索引越界异常,集合会报
    ArrayIndexOutOfBoundsException:数组索引越界异常
    StringIndexOutOfBoundsException:字符串索引越界异常
 */
public class Demo01ListComonMethod {
    public static void main(String[] args) {
        //创建一个对象，使用多态，注意前面是List
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println("初始化："+list);

        //第一种、指定位置添加
        list.add(2,"index");
        System.out.println(list);
        System.out.println("--------------------");

        //第二种、移除指定位置的元素
        String removeE = list.remove(1);
        System.out.println("被移除的元素："+removeE);
        System.out.println(list);
        System.out.println("--------------------");

        //第三种、替换指定位置的元素
        String setE = list.set(2, "three");
        System.out.println("被替换的元素："+setE);
        System.out.println(list);
        System.out.println("--------------------");

        //【遍历】List集合的三种方法
        //1、使用普通for循环
        for (int i = 0; i < list.size(); i++) {
            //第四种、获取指定位置的元素
            String getE = list.get(i);
            System.out.println(getE);
        }
        System.out.println("*************************");
        //2、使用迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("*************************");

        //3、使用增强for循环，快捷方式list.for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("*************************");
    }
}
