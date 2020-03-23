package item01BufferStream;

import java.io.*;

/*
文件复制练习:一读一写

明确:
    数据源     数据的目的地

文件复制的步骤:
    1.创建字节缓冲输入流对象,构造方法中传递字节输入流
    2.创建字节缓冲输出流对象,构造方法中传递字节输出流
    3.使用字节缓冲输入流对象中的方法read,读取文件
    4.使用字节缓冲输出流中的方法write,把读取的数据写入到内部缓冲区中
    5.释放资源(会先把缓冲区中的数据,刷新到文件中)
 */
public class Demo03Copy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        //1.创建字节缓冲输入流对象,构造方法中传递字节输入流
        //2.创建字节缓冲输出流对象,构造方法中传递字节输出流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\item\\fire.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\item\\2.png"));

        //3.使用字节缓冲输入流对象中的方法read,读取文件
        //4.使用字节缓冲输出流中的方法write,把读取的数据写入到内部缓冲区中
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0,len);
        }

        //5.释放资源(会先把缓冲区中的数据,刷新到文件中)
        bos.close();
        bis.close();

        long end = System.currentTimeMillis();
        System.out.println("共用时"+(end-start)+"毫秒");
    }
}
