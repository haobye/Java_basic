package item03Math;
/*
题目：
    计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少
 */
public class demo02Program {
    public static void main(String[] args) {
        int count = 0;

        double min = -10.8;
        double max = 5.9;

        //起始位置-10.8转换为-10的两种放法：
        //1.使用强转为int，自动舍弃小数位。
        //2.也可以使用Math.ceil方法，向上取整。（-10.8变为-10.0）
            //注意：double也可以进行++的。
        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("总共有" + count + "个");
    }
}
