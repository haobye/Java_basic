package item02HashSet;

import java.util.HashSet;
import java.util.Set;
/*
set集合不允许存储重复元素的原理

名字中的save表示存储
 */
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        System.out.println(set);
    }
}
