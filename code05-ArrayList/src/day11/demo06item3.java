package day11;

import java.util.ArrayList;

/*
题目：
    定义以指定格式打印集合的方法(ArrayList类型作为参照)，使用{}扩张集合，使用@分隔每个元素
    即要求格式：{元素@元素@元素}

正常格式：System.out.println(list); ----> [10, 20, 30]
 */
public class demo06item3 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("古力娜扎");
        list.add("古塔那");
        list.add("迪丽热巴");
        list.add("消灭你");
        list.add("拨弄胳膊");
        printUnique(list);
    }

    public static void printUnique(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size()-1) {
                System.out.println(list.get(i) + "}");
            } else {
                System.out.print(list.get(i));
                System.out.print("@");
            }
        }
    }
}
