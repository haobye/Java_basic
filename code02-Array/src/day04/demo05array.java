package day04;
/*
数组的概念：是一种容器，可以同时存放多个数据值

数组的特点：
    1.数组是一种引用类型，除了8+1中基本类型，其余都是引用类型
    2.数组中的多个数据，类型必须统一
    3.数组的长度在程序运行期间不可改变


数组两种常见的初始化：
1.动态初始化（指定长度）：
    格式：数据类型[] 数组名称 = new 数据类型[数组长度]
    解析：左数据类型：就是数组中保存的数据，全都是统一类型，且和右边的数据类型保持一致。
         左侧中括号：代表我是一个数组。左侧数组名称：给数组起一个名字
         右侧的new：代表创建数组的动作。
         右侧数组长度：就是数组中可以保存多少个数据，是int数字。
 */
public class demo05array {
    public static void main(String[] args) {

        //创建一个能放300个int类型数据的数组
        int[] name1 = new int[300];
        //拆分为两个步骤
        int[] name11;
        name11 = new int[200];


        //创建一个能放10个double类型数据的数组
        double[] name2 = new double[10];

        //创建一个能放5个String类型数据的数组,需要注意S大写
        String[] name3 = new String[5];
    }
}
