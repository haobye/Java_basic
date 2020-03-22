package item01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
Map集合的第一种遍历方式:通过键找值的方式

Map集合中的方法:
     Set<K> keySet() 返回此映射中包含的键的 Set 视图。

实现步骤:
    1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
    2.遍历set集合,获取Map集合中的每一个key
    3.通过Map集合中的方法get(key),通过key找到value
 */
public class Demo03KeySet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("李嘉诚", 168);
        map.put("马化腾", 165);
        map.put("王建林", 172);

        //一二三步
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key+"-- >"+value);
        }


        System.out.println("********************************");
        //第一步
        Set<String> set = map.keySet();

        //第二步（增强for）
        for (String key : set) {
            //第三步
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }

        //第二步（迭代器）
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            //第三步
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
