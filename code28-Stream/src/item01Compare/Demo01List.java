package item01Compare;

import java.util.ArrayList;

/*
    使用传统的方式,遍历集合,对集合中的数据进行过滤
 */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合,存储姓名
        ArrayList<String> list = new ArrayList<>();
        list.add("韩崇浩男");
        list.add("韩崇宇男");
        list.add("韩崇翔男");
        list.add("韩晓晓");
        list.add("韩晓彤");
        list.add("韩晓彤");
        list.add("徐风运男");
        list.add("徐婉晨");

        //对list集合中的元素进行过滤,只要以张开头的元素,存储到一个新的集合中
        ArrayList<String> listA = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("韩")){
                listA.add(s);
            }
        }

        //对listA集合进行过滤,只要姓名长度为3的人,存储到一个新集合中
        ArrayList<String> listB = new ArrayList<>();
        for (String s : listA) {
            if(s.length() > 3){
                listB.add(s);
            }
        }

        //遍历集合
        for (String s : listB) {
            System.out.println(s);
        }
    }
}
