package item03Interface;

import java.util.Arrays;
import java.util.Comparator;

/*
函数式接口作为【方法的返回值】 的案例：

    如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。
    当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时,就可以调该方法获取。
 */
public class Demo02Comparator {
    //定义一个方法，返回的返回值使用函数式接口Comparator类型
    public static Comparator<String> getComparator(){
        //方法的返回值类型是一个接口，我们可以返回这个接口的匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //按照字符串长度降序排列
//                return o2.length() - o1.length();
//            }
//        };

        //我们可以返回Lambda表达式
//        return (String o1, String o2) -> {
//            return o2.length() - o1.length();
//        };

        //可以优化Lambda表达式
        return (String o1, String o2) -> o1.length() - o2.length();
    }

    public static void main(String[] args) {
        //定义一个字符串数组
        String[] arr = {"aaa","b","ddd","cc"};
        //输出排序前的数组
        System.out.println("排序前 " + Arrays.toString(arr));
        //排序
        Arrays.sort(arr, getComparator());
        //输出排序后的数组
        System.out.println("排序后 " + Arrays.toString(arr));
    }
}
