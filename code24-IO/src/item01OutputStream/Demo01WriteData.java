package item01OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
/*
OutputStream:字节输出流

定义了一些子类共性的成员方法:
        - public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
        - public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出。
        - public abstract void write(int b) ：将指定的字节输出流。
                      ========== 以下：使用于Demo02Optimize ==========
            - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。【没有文件则创建】【覆盖】
            - public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。

FileOutputStream:文件字节输出流        java.io.FileOutputStream extends OutputStream
    【作用】:把内存中的数据写入到硬盘的文件中

构造方法:
        FileOutputStream(String name)创建一个向具有指定名称的文件中写入数据的输出文件流。
        FileOutputStream(File file) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
        参数:写入数据的目的
            【String name】:目的地是一个【文件的路径】
            【File file】:目的地是一个【文件】
        构造方法的作用:
            1.创建一个FileOutputStream对象
            2.会根据构造方法中传递的文件/文件路径,创建一个空的文件
            3.会把FileOutputStream对象指向创建好的文件

字节输出流的使用【步骤】(重点):
        1.创建一个FileOutputStream对象,构造方法中传递写入数据的目的地
        2.调用FileOutputStream对象中的方法write,把数据写入到文件中
        3.释放资源(流使用会占用一定的内存,使用完毕要把内存清空,提供程序的效率)
 */
public class Demo01WriteData {

    //三步都会报错，只需要声明第二步就可以啦，因为IO异常是父类。

    public static void main(String[] args) throws IOException {
        //1.创建一个FileOutputStream对象,构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("F:\\item\\a.txt");

        //2.调用FileOutputStream对象中的方法write,把数据写入到文件中
                //- public abstract void write(int b) ：将指定的字节输出流。
        fos.write(99);
                //十进制的99会被转换为二进制的字节(97->a,98->b,99->c)

        //3.释放资源(流使用会占用一定的内存,使用完毕要把内存清空,提供程序的效率)
                //- public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
        fos.close();
    }
}
