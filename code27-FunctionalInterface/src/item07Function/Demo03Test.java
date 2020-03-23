package item07Function;

import java.util.function.Function;

/*
    练习：自定义函数模型拼接

    题目:请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
            String str = "赵丽颖,20";
            1. 将字符串截取数字年龄部分，得到字符串；
            2. 将上一步的字符串转换成为int类型的数字；  string-int
            3. 将上一步的int数字累加100，得到结果int数字。
 */
public class Demo03Test {
    public static int count(String str, Function<String,String> fun1, Function<String,Integer> fun2){
        return fun1.andThen(fun2).apply(str);

    /*public static void count(String str, Function<String,String> fun1, Function<String,Integer> fun2){
        Integer in = fun1.andThen(fun2).apply(str);
        System.out.println(in);*/
    }

    public static void main(String[] args) {
        String str = "赵丽颖,20";
        int num = count(str,
                (String s)->{
                    return s.split(",")[1];
                },
                (String s)->{
                    return Integer.parseInt(s) + 100;
                });
        System.out.println(num);
    }
}
