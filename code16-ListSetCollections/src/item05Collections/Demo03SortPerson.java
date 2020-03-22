package item05Collections;

import java.util.ArrayList;
import java.util.Collections;
/*
sort排序函数

注意事项:
     sort(List<T> list)使用前提
     被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

Comparable接口的排序规则:
    自己(this)-参数:升序
    （自己在前就升序，自己在后就降序）
 */
public class Demo03SortPerson {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Collections.addAll(list, new Person("小明", 18),new Person("小红", 14), new Person("小智", 16));
        System.out.println("初始化："+list);

        Collections.sort(list);  //需要在Person中重写compareTo定义排序规则
        System.out.println("排序后："+list);
    }
}
