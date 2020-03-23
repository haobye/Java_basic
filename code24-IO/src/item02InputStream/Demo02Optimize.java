package item02InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
字节输入流一次读取多个字节的方法:
    int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
            明确两件事情:
                1.方法的参数byte[]的作用?
                    起到缓冲作用,存储每次读取到的多个字节
                    数组的长度一把定义为1024(1kb)或者1024的整数倍
                2.方法的返回值int是什么?
                    每次读取的有效字节个数

String类的构造方法:
    String(byte[] bytes) :把字节数组转换为字符串
    String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串 offset:数组的开始索引 length:转换的字节个数
 */
public class Demo02Optimize {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\item\\a.txt");   //文件内容：cbn

        /*byte[] bytes = new byte[2];  //一次读取两个字节
        int len = fis.read(bytes);
        System.out.println(len);  //读取的有效字节
        //System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));  //转换成字符串

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));*/


        /*
        发现以上读取时一个重复的过程,可以使用循环优化
        不知道文件中有多少字节,所以使用while循环，while循环结束的条件,读取到-1结束
         */
        byte[] bytes = new byte[1024];
        int len = 0;  //记录每次读取的有效字节数
        while((len = fis.read(bytes)) != -1){
            //System.out.println(new String(bytes));   //1024空间没有用完，资源浪费，使用下面的方法
            System.out.println(new String(bytes, 0, len));  //使用输出从0到len长度的内容
        }

        fis.close();
    }
}
