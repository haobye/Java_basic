package item05Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 5, 1, 3, 7);
        System.out.println("排序前："+list01);
        //int类型默认升序
        Collections.sort(list01);
        System.out.println("排序后："+list01);
        System.out.println("--------------------------------------");

        ArrayList<String> list02 = new ArrayList<>();
        Collections.addAll(list02,"c", "d", "e", "b", "a");
        System.out.println("排序前："+list02);
        //String类型默认自然顺序
        Collections.sort(list02);
        System.out.println("排序后："+list02);
    }
}
