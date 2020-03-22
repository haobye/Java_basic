package item03Calendar;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

/*
Calendar类的常用成员方法：
    1、public int get(int field)：返回给定日历字段的值
    2、public void set(int field, int value)：将给定的日历字段设置为给定值
    3、public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量
    4、public Date getTime()：返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象。

成员方法的参数：
    int field：日历类的字段，可以使用Calendar类的静态成员变量获取
        public static final int YEAR = 1;
        public static final int MONTH = 2;
        public static final int DATE = 5;        月中的某一天
        public static final int DAY_OF_MONTH = 5;  月中的某一天
        public static final int HOUR = 10;
        public static final int MINUTE = 12;
        public static final int SECOND = 13;
 */
public class Demo02FourMemberMethod {
    public static void main(String[] args) {
//        demo01get();
//        demo02set();
//        demo03add();
        demo04getTime();
    }


    /*
        4、public Date getTime()：返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象。
            把【日历】对象转换成【日期】对象
     */
    private static void demo04getTime() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }


    /*
        3、public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量
            参数：int field 传递指定的日历字段(YEAR,MONTH……)
                  int amount 添加或减去的值    正数：增加   负数：减少
     */
    private static void demo03add() {
        Calendar c = Calendar.getInstance();
        //增加三年
        c.add(Calendar.YEAR, 3);
        //减少两个月
        c.add(Calendar.MONTH, -2);
        //输出
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);   //西方的月份0-11，东方的月份1-11
        int day = c.get(Calendar.DATE);
        System.out.println(day);
    }


    /*
        2、public void set(int field, int value)：将给定的日历字段设置为给定值
            参数：int field传递指定的日历字段(YEAR,MONTH……)
                  int value给指定字段设置的值
     */
    private static void demo02set() {
        Calendar c = Calendar.getInstance();
        //重新设置年
        c.set(Calendar.YEAR, 2025);
        c.set(Calendar.DATE, 16);
        //同时设置年月日，可以使用set的重载方法
        c.set(3000,11,16);
        //输出
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);    //西方的月份0-11，东方的月份1-11
        int day = c.get(Calendar.DATE);
        System.out.println(day);
    }


    /*
        1、public int get(int field)：返回给定日历字段的值
            参数：传递指定的日历字段(YEAR,MONTH……)
            返回值：日历字段中代表的具体的值
     */
    private static void demo01get() {
        //使用getInstance()获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);   //西方的月份0-11，东方的月份1-11
//        int day = c.get(Calendar.DAY_OF_MONTH);
        int day = c.get(Calendar.DATE);
        System.out.println(day);
    }
}
