package item05StringOutputStream;

import java.io.FileWriter;
import java.io.IOException;

/*
字符输出流写数据的其他共性方法
    - void write(char[] cbuf)写入字符数组。
    - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
    - void write(String str)写入字符串。
    - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 */
public class Demo03OtherWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\item\\other.txt");

        char[] cs = {'a', 'b', 'c', 'd', 'e'};
        //1、void write(char[] cbuf)写入字符数组。
        fw.write(cs);
        //2、abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        fw.write(cs, 0,3);

        //3、void write(String str)写入字符串。
        fw.write("传智播客");
        //4、void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        fw.write("黑马程序员", 2,3);


        fw.close();
    }
}
