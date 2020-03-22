package day08;
import java.util.Scanner;

/*
求出键盘输入的两个int值的和
 */
public class demo02Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);
    }
}
