package item07Function;

import java.util.function.Function;

/*
Function接口中的默认方法【andThen】:用来进行【组合操作】

    需求:
        把String类型的"123",转换为Inteter类型,把转换后的结果加10
        把增加之后的Integer类型的数据,转换为String类型

    分析:
        1.1、第一次转换是把String类型转换为了Integer类型
        1.2、第二次转换是把Integer类型转换为String类型
        2、我们可以使用andThen方法,把两次转换组合在一起使用
 */
public class Demo02andThen {
    public static void change(String s, Function<String,Integer> fun1, Function<Integer,String> fun2){
        /*Integer i = fun1.apply(s);
        System.out.println("133-----"+i);
        String ss = fun2.apply(i);
        System.out.println("String--"+ss);*/
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        String string = "123";
        change(string,
                (String str)->{
                    //将字符串转换为整数类型，并加上10
                    return Integer.parseInt(str) + 10;
                },
                (Integer in)->{
                    //将整数转换为字符串类型
                    return in + "";
                });

        //优化Lambda表达式
        change(string, str->Integer.parseInt(str)+10, in->in+"");
    }
}
