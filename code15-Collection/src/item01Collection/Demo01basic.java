package item01Collection;

import java.util.ArrayList;
import java.util.Collection;
/*
java.util.Collection【接口】
    所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
    任意的单列集合都可以使用Collection接口中的方法

共性的方法:
    public boolean add(E e)：把指定的对象添加到当前集合中
    public void clear() :清空集合中所有的元素。
    public boolean remove(E e): 把指定的对象在当前集合中删除。
    public boolean contains(E e): 判断当前集合中是否包含给定的对象。
    public boolean isEmpty(): 判断当前集合是否为空。
    public int size(): 返回集合中元素的个数。
    public Object[] toArray(): 把集合中的元素，存储到数组中。
 */
public class Demo01basic {
    public static void main(String[] args) {
        //创建对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println("result---"+coll);  //不是地址值，重写了toString方法

        /*
        public boolean add(E e)  把指定的对象添加到当前集合中
        返回值是一个boolean值，一般为true，所以可以不接收
         */
        boolean b1 = coll.add("张三");
        System.out.println("b1:"+b1);
        System.out.println("coll:"+coll);
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        System.out.println("result---"+coll);

        /*
        public boolean remove(E e)把指定的对象在当前集合中删除。
        返回值是boolean值。存在元素，删除元素，返回true；不存在元素，删除失败，则返回false
         */
        boolean b2 = coll.remove("王五");
        System.out.println("b2:"+b2);
        boolean b3 = coll.remove("不晓得");
        System.out.println("b3:"+b3);
        System.out.println("result---"+coll);

        /*
        public boolean contains(E e): 判断当前集合中是否包含给定的对象。
        包含返回true，不包含返回false。不影响集合
         */
        boolean b4 = coll.contains("张三");
        System.out.println("是否包含给定的对象："+b4);

        /*
        public boolean isEmpty(): 判断当前集合是否为空。
        集合为空返回true，集合不为空返回false
         */
        boolean b5 = coll.isEmpty();
        System.out.println("集合是否为空："+b5);

        /*public int size(): 返回集合中元素的个数。*/
        int size = coll.size();
        System.out.println("集合个数："+size);

        /*public Object[] toArray(): 把集合中的元素，存储到数组中。*/
        Object[] arr = coll.toArray();
        System.out.println("循环数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*public void clear() :清空集合中所有的元素*/
        coll.clear();
        System.out.println("result---"+coll);
        System.out.println(coll.isEmpty());
    }
}
