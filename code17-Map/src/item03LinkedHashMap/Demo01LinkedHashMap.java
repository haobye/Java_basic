package item03LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
java.util.LinkedHashMap<K,V> entends HashMap<K,V>         LinkedHashMap 继承啦 HashMap

Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。       LinkedHashMap是有序的

底层原理:
    哈希表+链表(记录元素的顺序)
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();  //不允许重复，无序
        map.put("a", 1);
        map.put("c", 3);
        map.put("b", 4);
        map.put("a", 8);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"======"+value);
        }
        System.out.println("****************************");


        LinkedHashMap<String, Integer> linked = new LinkedHashMap<>();  //不允许重复，有序
        linked.put("a", 1);
        linked.put("c", 3);
        linked.put("b", 4);
        linked.put("a", 8);
        for (Map.Entry<String, Integer> entry1 : linked.entrySet()) {
            String key = entry1.getKey();
            Integer value = entry1.getValue();
            System.out.println(key+"--->"+value);
        }
    }
}
