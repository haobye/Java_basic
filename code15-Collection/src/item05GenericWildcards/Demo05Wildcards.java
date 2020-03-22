package item05GenericWildcards;

import java.util.ArrayList;
import java.util.Iterator;
/*
泛型的通配符：？：代表任意的数据类型
使用方式：
    不能创建对象使用
    只能作为方法的参数使用
 */
public class Demo05Wildcards {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(8);
        list01.add(3);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("hao");
        list02.add("shuai");

        printArrayList(list01);
        printArrayList(list02);
    }

    // 我们不知道ArrayList是什么类型，所以使用泛型的通配符" ？"来接收数据类型。
    // 注意：泛型没有继承的概念
    private static void printArrayList(ArrayList<?> list) {
        //使用迭代器遍历
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            Object o = it.next();   //it.next()取出的元素是Object，可以接收任意的数据类型
            System.out.println(o);
        }
    }
}
