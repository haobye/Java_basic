package item06Predicate;

import java.util.function.Predicate;

/*
Predicate接口中有一个方法【or】,表示或者关系,也可以用于连接两个判断条件
    default Predicate<T> or(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }
    方法内部的两个判断条件,也是使用||运算符连接起来的

需求:判断一个字符串,有两个判断的条件
    1.判断字符串的长度是否大于5
    2.判断字符串中是否包含a
    【满足一个条件即可】,我们就可以使用【||】运算符连接两个条件
 */
public class Demo03or {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
        //return pre1.test(s) || pre2.test(s);
        return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        boolean b = checkString("bigWord",
                (String str) -> {
                    return str.length() > 5;
                },
                (str) -> {
                    return str.contains("w");   //大小写区分
                });
        System.out.println(b);
    }
}
