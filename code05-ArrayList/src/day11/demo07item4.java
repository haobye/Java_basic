package day11;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
    创建一个大集合，存储20个随机整数，然后筛选其中的偶数，放入小集合中
 */
public class demo07item4 {
    public static void main(String[] args) {

        ArrayList<Integer> big_list = new ArrayList<>();
        ArrayList<Integer> small_list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(50) + 1;
            big_list.add(num);
        }

        System.out.println("原集合为：" + big_list);

        for (int k = 0; k < big_list.size(); k++) {
            if (big_list.get(k) % 2 == 0) {
                small_list.add(big_list.get(k));
            }
        }

        System.out.println("偶数集合为：" + small_list);
    }
}
