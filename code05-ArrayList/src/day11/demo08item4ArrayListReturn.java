package day11;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
    创建一个大集合，存储20个随机整数，然后筛选其中的偶数，放入小集合中

还是第四题，不过这个使用定义方法
 */
public class demo08item4ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> big_list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            big_list.add(num);
        }
        System.out.println("大集合为：" + big_list);

        ArrayList<Integer> small_list = getSmallList(big_list);
        System.out.println("小集合为：" + small_list);
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> big_list) {
        ArrayList<Integer> small_list = new ArrayList<>();
        for (int h = 0; h < big_list.size(); h++) {
            if (big_list.get(h) % 2 ==0) {
                small_list.add(big_list.get(h));
            }
        }
        return small_list;
    }
}
