package day08;
import java.util.Scanner;

/*
求出键盘输入的三个int值的最大值
 */
public class demo03Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数值");
        int a = sc.nextInt();
        System.out.println("请输入第二个数值");
        int b = sc.nextInt();
        System.out.println("请输入第三个数值");
        int c = sc.nextInt();
        /*int res;
        if (a >= b) {
            res = a;
        } else {
            res = b;
        }
        if (res >= c) {
            System.out.println("最大值为" + res);
        } else {
            System.out.println("最大值为" + c);
        }*/
        int res = a > b ? a : b;
        //三元运算符，定义一个int类型的res，判断a是否大于b，若是True，则将a赋值给res；若是False，则将b赋值给res。
        int max = res > c ? res : c;
        System.out.println("最大值为" + max);
    }
}
