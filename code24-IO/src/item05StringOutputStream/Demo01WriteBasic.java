package item05StringOutputStream;

import java.io.FileWriter;
import java.io.IOException;

/*
java.io.Writer:字符输出流,是所有字符输出流的最顶层的父类,是一个抽象类

共性的成员方法:
    - void write(int c) 写入单个字符。
    - 其余的在Demo03OtherWrite中。

java.io.FileWriter extends OutputStreamWriter extends Writer
【FileWriter】:文件字符输出流      作用:把内存中字符数据写入到文件中

构造方法:
    FileWriter(File file)根据给定的 File 对象构造一个 FileWriter 对象。
    FileWriter(String fileName) 根据给定的文件名构造一个 FileWriter 对象。
        参数:写入数据的目的地
            String fileName:文件的路径
            File file:是一个文件
        构造方法的作用:
            1.会创建一个FileWriter对象
            2.会根据构造方法中传递的文件/文件的路径,创建文件
            3.会把FileWriter对象指向创建好的文件

字符输出流的使用步骤(重点):
    1.创建【FileWriter】对象,构造方法中绑定要写入数据的目的地
    2.使用FileWriter中的方法write,把数据写入到内存缓冲区中(字符转换为字节的过程)【在这一步没有将数据写入文件呢】
    3.使用FileWriter中的方法【flush】,把内存缓冲区中的数据,刷新到文件中【没有flush，只有close也会写入数据的】
    4.释放资源(会先把内存缓冲区中的数据刷新到文件中)【两者有其一就可写入】
            Demo02详细讲解两者区别
 */
public class Demo01WriteBasic {
    public static void main(String[] args) throws IOException {
        //1.创建【FileWriter】对象,构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("F:\\item\\filewrite.txt");

        //2.使用FileWriter中的方法write,把数据写入到内存缓冲区中(字符转换为字节的过程)【在这一步没有将数据写入文件呢】
        fw.write(67);

        //3.使用FileWriter中的方法【flush】,把内存缓冲区中的数据,刷新到文件中【没有flush，只有close也会写入数据的】
        fw.flush();

        //4.释放资源(会先把内存缓冲区中的数据刷新到文件中)【两者有其一就可写入】
        fw.close();
    }
}
