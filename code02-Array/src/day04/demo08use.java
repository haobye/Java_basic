package day04;
/*
使用动态初始化时，其中的元素会自动拥有一个默认值，
规则如下：
    整数int----0；  浮点float----0.0；
    字符string---'\u0000'；  布尔Boolean---false；
    引用类型----null

 */
public class demo08use {
    public static void main(String[] args) {

        int[] name = new int[3];

        System.out.println(name);   //哈希值
        System.out.println(name[0]);    //0
        System.out.println(name[2]);    //0
        System.out.println("=============");

        name[1] = 100;  //将100赋值给数组name中的第二个
        System.out.println(name[1]);
    }
}
