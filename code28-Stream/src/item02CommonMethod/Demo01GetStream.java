package item02CommonMethod;

import java.util.*;
import java.util.stream.Stream;

/*
java.util.stream.Stream<T>是Java 8新加入的最常用的流接口。（这并不是一个函数式接口。）
    获取一个流非常简单，有以下几种常用的方式：

        - 1、所有的Collection集合都可以通过stream默认方法获取流；
                default Stream<E> stream​()
        - 2、Stream接口的静态方法of可以获取数组对应的流。
                static <T> Stream<T> of​(T... values)
                参数是一个可变参数,那么我们就可以传递一个数组
 */
public class Demo01GetStream {
    public static void main(String[] args) {
        //1、把list集合转换为Stream流
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream01 = list.stream();

        //2、把set集合转换为Stream流
        Set<String> set = new HashSet<>();
        Stream<String> stream02 = set.stream();

        //3、把map集合转换为Stream流
        HashMap<String, String> map = new HashMap<>();
        //    获取键,存储到一个Set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream03 = keySet.stream();
        //    获取值,存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream04 = values.stream();
        //    获取键值对(键与值的映射关系 entrySet)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream05 = entries.stream();

        //把数组转换为Stream流
        Stream<Integer> stream10 = Stream.of(1, 2, 3, 4, 5);

        //可变参数可以传递数组
        Integer[] arr1 = {2, 4, 6, 8};
        Stream<Integer> stream11 = Stream.of(arr1);
        String[] arr2 = {"a", "bb", "ccc"};
        Stream<String> stream12 = Stream.of(arr2);
    }
}
