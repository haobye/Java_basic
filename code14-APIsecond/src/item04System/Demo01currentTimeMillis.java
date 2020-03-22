package item04System;
/*
在System类的API文档中，常用方法有两个：
    1、public static long currentTimeMillis()：返回以毫秒为单位的当前时间
 */
public class Demo01currentTimeMillis {

    public static void main(String[] args) {
        /*验证for循环打印1-9999所需时间*/
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 9999; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序运行时间："+(end-start)+"毫秒");
    }

}
