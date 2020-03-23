package item06Predicate;

import java.util.function.Predicate;

/*
    java.util.function.Predicate<T>接口
    作用:对某种数据类型的数据进行判断,结果返回一个boolean值

Predicate接口中包含一个抽象方法【test】：
    boolean test(T t):用来对指定数据类型数据进行【判断】的方法
        结果 : 符合条件,返回true
               不符合条件,返回false
 */
public class Demo01test {
    //定义一个方法，参数为：一个字符串，一个predicate接口，泛型使用String类型，【注意返回的是Boolean】
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        //定义一个字符串
        String s = "hello";
        //调用checkString方法，参数为字符串(可以直接将"hello"写作参数)和接口
        boolean b = checkString(s,(String str)->{
            return str.length() > 5;
        });
        System.out.println(b);

        //优化Lambda表达式
        boolean b2 = checkString("word", (String str) -> str.length() > 3);
        System.out.println(b2);
    }
}
