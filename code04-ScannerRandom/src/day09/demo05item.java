package day09;
import java.util.Random;
import java.util.Scanner;

/*
题目要求：
    根据int变量n的值，来获取随机数字，范围是[1,n],即可以取到1，也可以取到n
 */
public class demo05item {
    public static void main(String[] args) {
        System.out.println("输入n的值：");
        int n = new Scanner(System.in).nextInt();

        Random r = new Random();
        int num = r.nextInt(n) + 1; //本来范围是0~n-1，在外围+1后范围变为1~n
        System.out.println("随机数为："+num);
    }
}
