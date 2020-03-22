package item02Date;

import java.text.SimpleDateFormat;
import java.util.Date;

//日期 --> 文本
public class Demo04SimpleDateFormat {
    public static void main(String[] args) {
        demo01();
    }

    /*使用DateFormat类中的方法format，把日期格式化为文本，使用步骤12*/
    private static void demo01() {
        //1、创建SimpleDateFormat对象，并向构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //获取一个时间
        Date date = new Date();
        //2、调用SimpleDateFormat对象中的format方法，按照构造方法中指定的模式把Date日期格式化为符合模式的字符串文本
        String d = sdf.format(date);

        System.out.println(date);
        System.out.println(d);
    }
}
