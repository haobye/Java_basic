package item02HashSet;

import java.util.HashSet;

/*
HashSet存储自定义类型元素

【set集合】如何保证存储元素的【唯一】:
    存储的元素(String,Integer,...Student,Person...),必须【重写】【hashCode方法和equals方法】

要求:
    同名同年龄的人,视为同一个人,只能存储一次
 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小帅哥", 18);
        Person p2 = new Person("小帅哥", 18);
        Person p3 = new Person("小美女", 17);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println("-----------------------");

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
