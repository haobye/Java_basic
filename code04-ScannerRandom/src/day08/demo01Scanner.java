package day08;

import java.util.Scanner;

/*
Scanner类的功能：可以实现键盘输入

引用类型的一般使用步骤：
    1.导包：
        import 包路径.类名称；
        若是和当前类在同一个包下，可省略导包语句
        只有java.lang包下的内容不需要导包，其他的包都需要import语句
    2.创建
        类名称  对象名  =  new  类名称();
    3.使用
        对象名.成员方法名()
 */
public class demo01Scanner {
    public static void main(String[] args) {
        //2.创建（备注：System.in代表从键盘输入）
        Scanner sc = new Scanner(System.in);

        //3.获取键盘的输入
            //若是输入int数字：int num = sc.nextInt();
            //若是输入字符串：String str = sc.next();
            //num和str为名称、可以改变，sc是new时定义的名字
        int num = sc.nextInt();
        System.out.println("你输入的数字为：" + num);
        String str = sc.next();
        System.out.println("你输入的字符串是：" + str);
    }
}
