package item07Function;

import java.util.function.Function;

/*
    java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
        前者T 称为前置条件，后者R 称为后置条件。

    Function接口中最主要的抽象方法为：R apply(T t)，根据类型T的参数获取类型R的结果。
        使用的场景例如：【apply】将String类型【转换】为Integer类型。
 */
public class Demo01apply {
    //定义一个方法，参数为：字符串，Function接口，使用其中的apply方法
    public static void change(String s, Function<String, Integer> fun){
        //Integer i = fun.apply(s);   将其自动拆箱
        int i = fun.apply(s);
        System.out.println(i);
    }

    public static void main(String[] args) {
        change("19",(String str)->{
            return Integer.parseInt(str);
        });

        //优化Lambda表达式
        change("21",str -> Integer.parseInt(str));
    }
}
