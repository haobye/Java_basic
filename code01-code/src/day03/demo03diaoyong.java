package day03;
/*
方法的三种调用格式：
    1.单独调用：方法名称（参数）；
    2.打印调用：System.out.println(方法名称(参数));
    3.赋值调用：数据类型  变量名称 = 方法名称(参数)；

注意事项：
    此前学习的void只能使用单独调用的方法，无法使用打印和赋值调用
*/
public class demo03diaoyong {
    public static void main(String[] args) {
        //单独调用
        sum(10,20);   //a和b为系统提示，无法更改
        System.out.println("===================");

        //打印调用
        System.out.println(sum(10,20));
        System.out.println("===================");

        //赋值调用
        int number = sum(39, 11);
        number += 50;
        System.out.println(number);
    }

    public static int sum(int a, int b) {
        System.out.println("方法sum开始执行");
        int result = a + b;
        return result;
    }
}
