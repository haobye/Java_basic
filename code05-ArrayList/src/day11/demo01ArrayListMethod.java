package day11;

import java.util.ArrayList;

/*
ArrayList当中的常用方法有：
    public Boolean add(E e) 向集合中添加元素,返回值代表添加是否成功；
        备注：对于ArrayList来说，add是一定成功的，所以返回值可有可无，
             但是对于今后所学的其他集合来说，add添加动作就不一定成功，所以用返回值查看
    public E get(int index) 从集合中读取元素，返回值是对应位置的元素；
    public E remove(int index)  从集合中删除元素，返回值是被删的元素；
    public int size()   获取集合的尺寸长度；
 */
public class demo01ArrayListMethod {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();

        //向集合中添加元素
        boolean result = list.add("赵丽颖");
        System.out.println("添加是否成功：" + result);

        list.add("帅气");
        list.add("漂亮");
        list.add("健将");
        list.add("伊利");
        System.out.println(list);
        System.out.println("=================");

        //从集合中读取元素
        String name = list.get(3);
        System.out.println("读取索引为3的(即第四个)：" + name);
        //System.out.println(list.get(4));
        System.out.println("================");

        //从集合中删除元素
        String del = list.remove(0);     //删除第一个，即赵丽颖
        System.out.println("删除的是索引为0的(即第一个)：" + del);
        System.out.println("删除后集合" + list);
        System.out.println("================");

        //获取集合的尺寸长度
        int size = list.size();
        System.out.println("长度为：" + size);
    }
}
