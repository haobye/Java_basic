package item05Consumer;

import java.util.function.Consumer;

/*
   Consumer接口的默认方法【andThen】
        【作用】:需要两个Consumer接口,可以把两个Consumer接口组合到一起,在对数据进行消费

          例如：Consumer<String> con1
                Consumer<String> con2
                String s = "hello";
                con1.accept(s);
                con2.accept(s);
                连接两个Consumer接口，再进行消费
                con1.andThen(con2).accept(s); 【谁写前边谁先消费】
*/
public class Demo02andThen {
    //定义一个方法，参数为一个字符串，两个Consumer接口
    public static void method(String s, Consumer<String> con1, Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);
        //使用andThen方法
        con2.andThen(con1).accept(s);     // con2-con1即为先调用2再调用1，在此表现为先输出大写，后输出小写
    }

    public static void main(String[] args) {
        //调用method方法，传递参数
        method("Hello Word",
                (t)->{
                    //消费方式：字符串小写
                    System.out.println(t.toLowerCase());
                },
                (t)->{
                    //消费方式：字符串大写
                    System.out.println(t.toUpperCase());
                });
    }
}
