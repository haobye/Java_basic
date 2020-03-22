package item01Map;

import java.util.HashMap;

/*
1、public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
    返回值:v
        存储键值对的时候,key不重复,返回值V是null
        存储键值对的时候,key重复,会使用新的value替换map中重复的value,返回被替换的value值

2、public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
    返回值:V
        key存在,v返回被删除的值
        key不存在,v返回null

3、public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
    返回值:
        key存在,返回对应的value值
        key不存在,返回null

4、boolean containsKey(Object key) 判断集合中是否包含指定的键。
    包含返回true,不包含返回false
 */
public class Demo02CommonMethod {
    public static void main(String[] args) {
//        show01put();
//        show02remove();
//        show03get();
        show04panduan();
    }

    private static void show04panduan() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("林志玲", 163);
        boolean b1 = map.containsKey("赵丽颖");
        System.out.println(b1);
        boolean b2 = map.containsKey("洋洋");
        System.out.println(b2);
        System.out.println(map);
    }


    private static void show03get() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("林志玲", 163);
        map.put("迪丽热巴", 175);
        Integer g1 = map.get("赵丽颖");
        System.out.println("r1:"+g1);   //返回value值
        Integer g2 = map.get("杨颖");
        System.out.println("r2:"+g2);   //返回null空值
        System.out.println(map);
    }


    private static void show02remove() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("林志玲", 163);
        map.put("迪丽热巴", 175);
        Integer r1 = map.remove("赵丽颖");
        System.out.println("r1:"+r1);   //返回value值
        Integer r2 = map.remove("杨颖");
        System.out.println("r2:"+r2);   //返回null空值
        System.out.println(map);
    }


    private static void show01put() {
        HashMap<String, String> map = new HashMap<>();
        /*String s1 = map.put("李晨", "范冰冰1");
        System.out.println("s1:"+s1);
        String s2 = map.put("李晨", "范冰冰2");    //一般不会接收其返回值
        System.out.println("s2:"+s2);*/
        map.put("李晨","范冰冰");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        System.out.println(map);
    }
}
