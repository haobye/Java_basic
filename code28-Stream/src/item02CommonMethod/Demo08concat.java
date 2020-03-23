package item02CommonMethod;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_concat:用于把流【组合】到一起
        如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
            static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Demo08concat {
    public static void main(String[] args) {
        //分别创建两个Stream流
        Stream<String> stream1 = Stream.of("喜羊羊", "美羊羊", "懒洋洋");
        String[] arr = {"灰太狼", "红太狼", "小灰灰"};
        Stream<String> stream2 = Stream.of(arr);

        //使用concat方法，将两个流组合成一个
        Stream<String> concat = Stream.concat(stream1, stream2);

        //遍历concat流
        concat.forEach(name -> System.out.println(name));
    }
}
