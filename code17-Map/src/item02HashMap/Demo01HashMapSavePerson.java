package item02HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap存储自定义类型键值        HashMap是无序的

Map集合保证key是唯一的:
    作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show01PersonAsValue();
        System.out.println("--------------------------------------------------");
        show02PersonAsKey();
    }

    /*
    将Person作为Key值
    key：Person类型。需要重写hashCode方法和equals方法，以保证key的唯一
     */
    private static void show02PersonAsKey() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("女王", 19), "英国");
        map.put(new Person("普京", 20), "俄罗斯");
        map.put(new Person("秦始皇", 20), "秦国");
        map.put(new Person("女王", 19), "毛里求斯");
        //遍历
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"--->"+value);
        }
    }

    /*
    首先将Person作为value值
    key：String类型。String类重写了hashCode方法和equals方法,可以保证key唯一
     */
    private static void show01PersonAsValue() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("安徽", new Person("小明", 19));
        map.put("北京", new Person("小红", 20));
        map.put("深圳", new Person("小兰", 19));
        map.put("安徽", new Person("小智", 18));
        //遍历
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            String key = entry.getKey();
            Person value = entry.getValue();
            System.out.println(key+"---->"+value);
        }
    }
}
