package item02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator接口:迭代器(对集合进行遍历)
有两个常用的方法:
    1、boolean hasNext() 如果仍有元素可以迭代，则返回 true。
        判断集合中还有没有下一个元素,有就返回true,没有就返回false
    2、E next() 返回迭代的下一个元素。
        取出集合中的下一个元素

Iterator迭代器,是一个接口,我们无法直接使用,需要使用Iterator接口的实现类对象,获取实现类的方式比较特殊
Collection接口中有一个方法,叫iterator(),这个方法返回的就是迭代器的实现类对象
    Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。

【迭代器】的使用步骤(重点):
    1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
    2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
    3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        //向集合中添加数据
        coll.add("姚明");
        coll.add("詹姆斯");
        coll.add("科比");
        
        // 1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        // 注意：Inerator<E>接口也是有泛型的，迭代器的泛型跟着集合走
        Iterator<String> it = coll.iterator();
        System.out.println("it:"+it);

        /* 合并2、3
        使用迭代器去除集合中的元素的代码，是一个重复的过程，可以使用循环优化
        不知道有多少个元素，所以使用while循环，其结束条件：hasNext方法返回false */
        while(it.hasNext()) {
            String result = it.next();
            System.out.println(result);
        }

        //for循环，了解即可
        System.out.println("-----------------");
        for(Iterator<String> it2 = coll.iterator();it2.hasNext();) {
            String result = it2.next();
            System.out.println(result);
        }
//        // 2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
//        boolean b = it.hasNext();
//        System.out.println(b);
//        // 3.使用Iterator接口中的方法next取出集合中的下一个元素
//        String s = it.next();
//        System.out.println(s);
//
//        //将所有的数据取出来
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);   //没有时返回false
//        s = it.next();   //没有数据则抛出NoSuchElementException没有元素异常
//        System.out.println(s);
    }
}
