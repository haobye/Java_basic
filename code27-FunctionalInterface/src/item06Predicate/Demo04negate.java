package item06Predicate;

import java.util.function.Predicate;

/*
Predicate接口中有一个方法【negate】,也表示【取反!】的意思
    default Predicate<T> negate() {
        return (t) -> !test(t);
    }

    需求:判断一个字符串长度是否大于5
        如果字符串的长度大于5,那返回false
        如果字符串的长度不大于5,那么返回true
    所以我们可以使用取反符号!对判断的结果进行取反
 */
public class Demo04negate {
    public static boolean checkString(String s, Predicate<String> pre){
        //return !pre.test(s);
        return pre.negate().test(s);
    }

    public static void main(String[] args) {
        boolean b = checkString("four", (str) -> {
            return str.length() > 5;
        });
        System.out.println(b);  //长度不大于5，原为false，取反后成为true
    }
}
