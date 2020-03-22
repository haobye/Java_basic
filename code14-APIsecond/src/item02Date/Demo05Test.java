package item02Date;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
练习：请使用日期时间相关的API，计算一个人已经出生了多少天？
 */
public class Demo05Test {
    public static void main(String[] args) throws ParseException {
        //1、使用Scanner类中的next方法，获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期(格式:yyyy-MM-dd)：");
        String birthdayDateString = sc.next();

        //2、使用DateFormat类中的parse方法，将String类型的日期格式化为Date类型的
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);

        //3、把Date类型的日期转换为毫秒值
        long birthdayDateTime = birthdayDate.getTime();

        //4、获取当前系统日期的毫秒值
        long currentTime = new Date().getTime();

        //5、计算出毫秒的差值
        long time = currentTime - birthdayDateTime;

        //6、转化为以天为单位
        System.out.println(time/1000/60/60/24);
    }
}
