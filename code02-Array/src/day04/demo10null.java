package day04;
/*
所有的引用类型变量，都可以赋值为一个null值，但是代表什么都没有

数组必须进行new初始化才能使用其中的元素
如果只是赋值一个null，没有进行创建的话，将发生空指针异常NullPointerEcxeption

解决方法：补上null
 */
public class demo10null {
    public static void main(String[] args) {
        int[] array = null;
//        array = new int[3];
        System.out.println(array[0]);
    }
}
