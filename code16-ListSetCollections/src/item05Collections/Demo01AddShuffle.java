package item05Collections;

import java.util.ArrayList;
import java.util.Collections;
/*
java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：

    - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
    - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
 */
public class Demo01AddShuffle {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();

//        //原始增加元素方法
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");

        //一次增加很多元素的方法
        Collections.addAll(list, "a", "b", "c", "d", "e");
        System.out.println(list);

        //洗牌的方法
        Collections.shuffle(list);
        System.out.println(list);
    }
}
