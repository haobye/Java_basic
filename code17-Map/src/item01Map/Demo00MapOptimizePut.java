package item01Map;

import java.util.Map;

/*
JDK9的新特性:
    List接口,Set接口,Map接口:里边增加了一个静态的方法of,可以给集合一次性添加多个元素
    static <E> List<E> of​(E... elements)
    使用前提：当集合中存储的元素的个数已经确定了,不在改变时使用

 注意:
    1.of方法只适用于List接口,Set接口,Map接口,不适用于接口的实现类
    2.of方法的返回值是一个不能改变的集合,集合不能再使用add,put方法添加元素,会抛出异常
    3.Set接口和Map接口在调用of方法的时候,不能有重复的元素,否则会抛出异常
 */
public class Demo00MapOptimizePut {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("张三", 16, "李四", 17,"王五", 18, "赵六", 19);
//        Map<String, Integer> map = Map.of("张三", 16, "李四", 17,"王五", 18, "张三", 19);//IllegalArgumentException:非法参数异常,有重复的元素
        System.out.println(map);
        //map.put("老大", 18);     //UnsupportedOperationException:不支持操作异常
    }
}
