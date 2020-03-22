package item01Object;

import java.util.Objects;

/*
Objects类：它由一些静态的使用方法组成，这些方法是null-save(空指针安全的)或null-toletant(容忍空指针的)

在比较两个对象的时候：
Object的equals方法容易判处空指针异常，而Objects类中的equals方法就优化了这个问题。
 */
public class Demo03Objects {
    public static void main(String[] args) {
//        String s1 = "abc";
        String s1 = null;
//        String s2 = "aBc";
        String s2 = "abc";

//        boolean result1 = s1.equals(s2);
//        System.out.println(result1);

        /*使用Objects类中的equals就没有了空指针异常的报错啦
            源码：public static boolean equals(Object a, Object b) {
                      return (a == b) || (a != null && a.equals(b));
                 }
        */
        boolean result2 = Objects.equals(s1, s2);
        System.out.println(result2);
    }
}
