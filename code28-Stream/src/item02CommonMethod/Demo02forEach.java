package item02CommonMethod;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_forEach
        void forEach(Consumer<? super T> action);
            该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理。
                Consumer接口是一个消费型的函数式接口,可以传递Lambda表达式,消费数据

        forEach方法,用来【遍历】流中的数据,
            是一个【终结方法】,遍历之后就不能继续调用Stream流中的其他方法
 */
public class Demo02forEach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");

//        //使用Stream流中的方法forEach对Stream流中的数据进行遍历
//        stream.forEach((String name)->{
//            System.out.println(name);
//        });

        //优化Lambda表达式
        stream.forEach(name -> System.out.println(name));
    }
}
