package item06Predicate;

import java.util.function.Predicate;

/*
Predicate接口中有一个方法【and】,表示并且关系,也可以用于连接两个【判断】条件
    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> this.test(t) && other.test(t);
    }
方法内部的两个判断条件,也是使用【&&】运算符连接起来的

    逻辑表达式:可以连接多个判断的条件
        &&:与运算符,有false则false
        ||:或运算符,有true则true
        !:非(取反)运算符,非真则假,非假则真

    需求:判断一个字符串,有两个判断的条件
        1.判断字符串的长度是否大于5
        2.判断字符串中是否包含a
【两个条件必须同时满足】,我们就可以使用&&运算符连接两个条件
 */
public class Demo02and {
    //定义一个方法，参数为：一个字符串，两个Predicate接口，
    //一个用于判断字符串长度是否超过五，一个用来判断字符串中是否包含'a'，两个条件都满足才返回true
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
        //return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        boolean b = checkString("hello h",
                (String str) -> {
                    return str.length() > 5;
                },
                (String str) -> {
                    return str.contains("o");
                });
        System.out.println(b);
    }
}
