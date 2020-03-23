package item04Supplier;

import java.util.function.Supplier;

/*
【Supplier用于【生产】数据】
    java.util.function.Supplier<T>接口仅包含一个无参的方法：T get()。用来获取一个泛型参数指定类型的对象数据。
    Supplier<T>接口被称之为生产型接口,指定接口的泛型是什么类型,那么接口中的【get】方法就会生产什么类型的数据

 */
public class Demo01get {
    //定义一个方法,方法的参数传递Supplier<T>接口,泛型执行String,get方法就会返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //调用getString方法，参数是一个函数式接口，我们可以使用Lambda表达式
        String s = getString(() -> {
            return "胡歌";   //生产一个字符串，并返回
        });
        System.out.println(s);

        //优化Lambda表达式
        String s2 = getString(() -> "彭于晏");
        System.out.println(s2);
    }
}
