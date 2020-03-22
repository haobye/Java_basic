package day10;

import java.util.ArrayList;

/*
数组的长度不可以发生改变
但是ArrayList集合的长度是可以随意变化的。

对于ArrayList来说，其尖括号<>代表泛型。
    泛型：也就是装在集合当中的所有元素，全都是统一的什么类型
    注意事项：泛型只能是引用类型，不能是基本类型。
 */
public class demo02ArrayList {
    public static void main(String[] args) {
        //创建一个集合，命名为list，存储String类型元素，()默认是十个
        //备注：从JDK1.7+开始，右侧的尖括号<>里面可以不写内容，但是尖括号本身还是要的
        ArrayList<String> list = new ArrayList<>();

        //不再是地址值，而是一个空列表[]
        System.out.println(list);

        //向列表中添加内容，只能是字符串类型，因为定义为String
        list.add("韩崇浩");
        list.add("很健康");
        System.out.println(list);
    }
}
