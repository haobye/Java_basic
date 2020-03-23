package item01Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.lang.Throwable:类是 Java 语言中所有错误或异常的超类。

    异常就相当于程序得了一个小毛病(感冒,发烧),把异常处理掉,程序可以继续执行(吃点药,继续革命工作)
        【Exception】:编译期异常,进行编译(写代码)java程序出现的问题
        【RuntimeException】:运行期异常,java程序运行过程中出现的问题

    【Error】:错误
        错误就相当于程序得了一个无法治愈的毛病(非典,艾滋).必须修改源代码,程序才能继续执行
 */
public class Demo01Basic {
    public static void main(String[] args) /*throws ParseException*/ {
//        show01Exception();
//        show02RuntimeException();
        show03Error();
    }

    private static void show03Error() {
        //int[] arr = new int[1024*1024*1024];
        int[] arr = new int[1024*1024];
        System.out.println(arr);    //OutOfMemoryError: Java heap space,内存溢出的错误,创建的数组太大了,超出了给JVM分配的内存
    }

    private static void show02RuntimeException() {
        //2、运行期异常
        int[] arr = {1, 2, 3};
        //System.out.println(arr[1]);
        //索引超出范围，使用try
        try {
            //可能出错的代码
            System.out.println(arr[4]);
        } catch (Exception e) {
            //异常的处理逻辑
            System.out.println(e);
        }
    }

    private static void show01Exception() {
        //1、编译期异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse("1999-1116");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //这个报错有两种处理方法：声明(需要保证parse中的格式正确，否则无法执行后续代码)或者使用try(虽然报错，但是后续代码仍然可以执行)
        System.out.println(sdf);
        System.out.println("后续代码");
    }
}
