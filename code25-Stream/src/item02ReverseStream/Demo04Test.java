package item02ReverseStream;

import java.io.*;

/*
练习：【转换文件编码】：将GBK编码的文本文件，转换为UTF-8编码的文本文件。

    分析:
        1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称GBK
        2.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称UTF-8
        3.使用InputStreamReader对象中的方法read读取文件
        4.使用OutputStreamWriter对象中的方法write,把读取的数据写入到文件中
        5.释放资源
 */
public class Demo04Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\item\\stream\\我是GBK文件.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\item\\stream\\我是U8文件.txt"), "utf-8");

        int len = 0;
        while((len = isr.read()) != -1){
            osw.write(len);
        }

        isr.close();
        osw.close();
    }
}
