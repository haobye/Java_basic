package day11;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
    生成六个1-33之间的随机整数，添加到集合中，并遍历集合。
 */
public class demo04item1 {
    public static void main(String[] args) {

        ArrayList<Integer> list_int = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int res = r.nextInt(33) + 1;
            list_int.add(res);
            System.out.println((i+1) + "--->" + res);
        }

        System.out.println("列表：" + list_int);

        for (int j = 0; j < list_int.size(); j++) {
            System.out.println(list_int.get(j));
        }
    }
}
