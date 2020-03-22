package item01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合遍历的第二种方式:使用Entry对象遍历

Map集合中的方法:
    Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。

实现步骤:
    1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
    2.遍历Set集合,获取每一个Entry对象
    3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class Demo04EntrySet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 172);
        map.put("杨颖", 169);
        map.put("范冰冰", 178);

        // 1
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        // 2
        for (Map.Entry<String, Integer> entry : set) {
            // 3
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("------------------------");


        // 2
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            // 3
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
