package item03Math;
/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成于数学运算相关的操作。

public static double abs(double num):获取绝对值
public static double ceil(double num):向上取整（23.5-->24）
public static double floor(double num):向下取整
public static long round(double num):四舍五入

Math.PI代表近似的圆周率常量。(是double值)
 */
public class demo01Math {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(-2));
        System.out.println(Math.abs(0));
        System.out.println("======");

        //向上取整
        System.out.println(Math.ceil(23.4));  //24.0
        System.out.println(Math.ceil(23.9));  //24.0
        System.out.println("======");

        //向下取整
        System.out.println(Math.floor(23.4));  //23.0
        System.out.println(Math.floor(4.7));  //4.0
        System.out.println("======");

        //四舍五入，不带小数点
        System.out.println(Math.round(10.4));  //10
        System.out.println(Math.round(10.5));  //11
        System.out.println("======");
    }
}
