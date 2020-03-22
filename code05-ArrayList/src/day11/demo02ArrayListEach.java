package day11;

import java.util.ArrayList;

/*
集合的遍历
 */
public class demo02ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("古力娜扎");
        list.add("古塔那");
        list.add("迪丽热巴");
        list.add("消灭你");
        list.add("拨弄胳膊");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("集合中第" + (i+1) + "个：" + list.get(i));
        }
    }
}
