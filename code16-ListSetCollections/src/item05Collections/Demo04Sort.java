package item05Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
- java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

Comparable和Comparator的区别：
    1、Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
        （Demo03中演练）
    2、Comparator:相当于找一个第三方的裁判,比较两个
        （Demo04中演练）

Comparator的排序规则:
    o1-o2：升序
*/
public class Demo04Sort {
    public static void main(String[] args) {
//        show01int();
        show02StudentAge();
    }


    private static void show02StudentAge() {
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, new Student("语文", 19), new Student("b英语", 15), new Student("数学", 17), new Student("a浩浩", 15));
        System.out.println("原列表："+list);

//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //按年龄降序排列
//                return o2.getAge() - o1.getAge();
//            }
//        });
//        System.out.println("排序后："+list);

        //扩展了解：当年龄相同时，可比较名字的首字母
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println("升序排列："+list);
    }


    private static void show01int() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 4, 3, 8, 5, 1);
        System.out.println("初始化："+list);

        Collections.sort(list, new Comparator<Integer>() {
            //重写啦比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;     //升序
                return o2 - o1;     //降序
            }
        });
        System.out.println("排序结果："+list);
    }
}
