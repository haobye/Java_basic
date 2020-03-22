package day09;
import java.util.Random;

/*
随机函数：
    1.导包：import java.util.Random;
    2.创建：Random r = new Random();   小括号中可以留空
    3.使用：
        获取一个随机数字：int num = r.nextInt()（范围是int的所有范围，即有正负两种）
        获取一个随机数字：int num = r.nextInt(3)（实际代表[0,3)，左闭右开）
 */
public class demo03Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("获取到的随机数为：" + num);
    }
}
