package item01ListBasic;

import java.util.LinkedList;
/*
java.util.LinkedList集合 implements List接口

LinkedList集合的特点:
    1.底层是一个链表结构:查询慢,增删快
    2.里边包含了大量操作首尾元素的方法
注意:使用LinkedList集合特有的方法,不能使用多态

    - public void addFirst(E e):将指定元素插入此列表的开头。【】此方法相当于public void push(E e):将元素推入此列表所表示的堆栈。
    - public void addLast(E e):将指定元素添加到此列表的结尾。【】此方法相当于 add

    - public E removeFirst():移除并返回此列表的第一个元素。【】此方法相当于public E pop():从此列表所表示的堆栈处弹出一个元素。
    - public E removeLast():移除并返回此列表的最后一个元素。

    - public E getFirst():返回此列表的第一个元素。
    - public E getLast():返回此列表的最后一个元素。

    - public boolean isEmpty()：如果列表不包含元素，则返回true。
                【【可配合get的方法使用，先判断是否有元素，再取，否则若是没有元素会报错
 */
public class Demo02LinkedListComonMethod {
    public static void main(String[] args) {
//        show01add();
//        show02remove();
        show03get();
    }


    //演练两个获取元素的方法，并配合使用isEmpty（判断列表中是否包含元素）
    private static void show03get() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println("初始化LinkedList列表："+linked);

//        linked.clear();  //将列表清空

        if(! linked.isEmpty()) {  //配合使用isEmpty，当列表为空时返回true。【非!，注意英文状态】
            //获取第一个元素
            String first = linked.getFirst();
            System.out.println("第一个元素："+first);
            //获取最后一个元素
            String last = linked.getLast();
            System.out.println("最后一个元素："+last);
        }
    }


    //演练三个移除元素的方法
    private static void show02remove() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println("初始化LinkedList列表："+linked);
        //两个移除第一位元素的方法
//        String first = linked.removeFirst();
        String first = linked.pop();
        System.out.println("被移除的第一位元素："+first);
        //一个移除最末位元素的方法
        String last = linked.removeLast();
        System.out.println("被移除的最末位元素："+last);
        System.out.println(linked);
    }


    //演练四个添加元素的方法
    private static void show01add() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println("初始化LinkedList列表："+linked);
        //两个添加在头部的方法
        linked.addFirst("www");
        linked.push("http");
        //两个添加在尾部的方法
        linked.addLast("com");
        linked.add("cn");
        System.out.println(linked);
    }
}
