package day09;
import java.util.Random;
import java.util.Scanner;

/*
猜数字小游戏，生成一个随机数，使用键盘输入猜测，自动判断猜大啦还是猜小啦
 */
public class demo06RandomGame {
    public static void main(String[] args) {
        int num = new Random().nextInt(100) + 1;

        while (true) {
            System.out.print("猜测：");
            Scanner sc = new Scanner(System.in);
            int mone = sc.nextInt();
            if (mone > num) {
                System.out.println("猜大啦");
            } else if (mone < num) {
                System.out.println("猜小啦");
            } else if (mone == num) {
                System.out.println("猜中啦！！！");
                break;
            }
        }

    }
}
