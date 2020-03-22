package day09;
import java.util.Random;

/*
取出十个100以内的整数
 */
public class demo04Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100);
            System.out.println("第"+(i+1)+"次随机数为"+num);
        }
    }
}
