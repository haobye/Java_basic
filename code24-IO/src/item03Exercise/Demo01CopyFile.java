package item03Exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件【复制】练习:一读一写

明确:
    数据源: c:\\1.jpg
    数据的目的地: d:\\1.jpg

文件复制的步骤:
    1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
    2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
    3.使用字节输入流对象中的方法read读取文件
    4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
    5.释放资源
 */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("F:\\item\\a.txt");

        FileOutputStream fos = new FileOutputStream("F:\\item\\aaa.txt");

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }

        fis.close();
        fos.close();

        long end = System.currentTimeMillis();
        System.out.println("本次复制共用时"+(end-start)+"毫秒");
    }
}
