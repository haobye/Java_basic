package item02Date;

import java.util.Date;    //注意是util中的Date，而不是sql中的。

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    /*
        Long getTime() 把日期转换为毫秒值（相当于System.currentTimeMillis()方法）
        返回 自1970年1月1日 00:00:00至此 的毫秒值
     */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);      //1558869632972
    }


    /*
        Date类的带参数构造方法
        Date(Long date)：传递毫秒值，把毫秒值转换为日期时间
     */
    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date);   //Thu Jan 01 08:00:00 CST 1970  因为是中国时间(东八区)所以多了8小时
        date = new Date(1558869318193L);
        System.out.println(date);   //使用Demo01Date.java中的当前时间
    }


    /*
        Date类的空参数构造方法
        Date() 获取当前系统的日期和时间
     */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);     //Sun May 26 19:12:11 CST 2019
        //CST是指中国时间，一般为北京时间或者上海时间。
        //打印对象名不是地址值，所以重写了toString方法
    }
}
