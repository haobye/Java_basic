package day09;
import java.util.Scanner;

public class demo02Anonymous {
    public static void main(String[] args) {
        //使用一般方法
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();

        //使用匿名函数
//        int num2 = new Scanner(System.in).nextInt();

        //使用一般方法来传入sc参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //使用匿名函数来传入sc参数
//        methodParam(new Scanner(System.in));

        //将sc参数作为返回值
        int num4 = methodReturn().nextInt();
        System.out.println("你返回：" + num4);
    }

    public static void methodParam(Scanner sc) {
        int num3 = sc.nextInt();
        System.out.println("你传入为：" + num3);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}


