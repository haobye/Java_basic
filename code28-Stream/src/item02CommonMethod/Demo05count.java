package item02CommonMethod;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    Stream流中的常用方法_count:用于【统计】Stream流中元素的【个数】
        long count();
            count方法是一个【终结方法】,返回值是一个long类型的整数
            所以不能再继续调用Stream流中的其他方法了
 */
public class Demo05count {
    public static void main(String[] args) {
        //创建一个列表
        ArrayList<Integer> list = new ArrayList<>();

        //添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //转换为Stream流
        Stream<Integer> stream = list.stream();

        //使用count方法，统计其中个数
        long count = stream.count();
        System.out.println("元素中个数：" + count);
    }
}
