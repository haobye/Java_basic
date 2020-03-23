package item02CommonMethod;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_limit:用于【截取】流中的元素
        limit方法可以对流进行截取，只取用前n个。方法签名：
            Stream<T> limit(long maxSize);
                参数是一个long型，如果集合当前长度大于参数则进行截取；否则不进行操作

    limit方法是一个【延迟方法】,只是对流中的元素进行截取,返回的是一个新的流,所以可以继续调用Stream流中的其他方法
 */
public class Demo06limit {
    public static void main(String[] args) {
        //获取Stream流
        String[] arr = {"喜羊羊", "美羊羊", "灰太狼", "红太狼"};
        Stream<String> stream = Stream.of(arr);

        //使用limit对Stream流中的元素进行截取,只要前3个元素
        Stream<String> stream2 = stream.limit(3);
        //Stream<String> stream2 = stream.limit(5);    //截取超过本身长度，输出全部，不报错

        //遍历
        stream2.forEach(name -> System.out.println(name));
    }
}
