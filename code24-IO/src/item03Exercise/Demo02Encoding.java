package item03Exercise;

import java.io.FileInputStream;
import java.io.IOException;

/*
使用字节流读取中文文件
    1个中文
        GBK:占用两个字节
        UTF-8:占用3个字节

此问题于item04中解答
 */
public class Demo02Encoding {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\item\\c.txt");
        int len = 0;
        while((len = fis.read()) != -1){
            System.out.println(len);
//            System.out.println((char)len);
        }
        fis.close();
    }
}
