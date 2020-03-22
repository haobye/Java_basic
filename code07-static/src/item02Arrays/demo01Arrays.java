package item02Arrays;

import java.util.Arrays;

/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。

public static String toString(数组)：将参数数组变成字符串（默认格式:[元素1，元素2，……]）
public static void sort(数组)：按照默认升序(从小到大)对数组的元素进行排序。

备注：
    1.如果是数值，sort默认是升序，从小到大
    2.如果是字符串，sort默认是按照字母升序
    3.如果是自定义类型，那么这个自定义类需要有Comparable或者Comparator接口的支持
 */
public class demo01Arrays {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        String str = Arrays.toString(array1);
        System.out.println(str);    //[1, 2, 3, 4]

        int[] array2 = {2,8,3,6};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));//[2, 3, 6, 8]

        String[] array3 = {"cc", "aa", "bb"};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
    }
}
