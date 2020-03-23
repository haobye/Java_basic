package item01Compare;

import java.util.ArrayList;

/*
    使用Stream流的方式,遍历集合,对集合中的数据进行过滤
    Stream流是JDK1.8之后出现的
    关注的是做什么,而不是怎么做
 */
public class Demo02Stream {
    public static void main(String[] args) {
        //创建一个List集合,存储姓名
        ArrayList<String> list = new ArrayList<>();
        list.add("韩崇浩男");
        list.add("韩崇宇男");
        list.add("韩崇翔男");
        list.add("韩晓晓");
        list.add("韩晓彤");
        list.add("徐风运男");
        list.add("徐清新");
        list.add("徐婉晨");

        //对list集合中的元素进行过滤,只要以张开头的元素,存储到一个新的集合中
        //对listA集合进行过滤,只要姓名长度为3的人,存储到一个新集合中
        //遍历listB集合
        list.stream()
                .filter(name -> name.startsWith("韩"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
                ;
    }
}
