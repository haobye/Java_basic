package item02ReverseStream;

import java.io.FileReader;
import java.io.IOException;

/*
    FileReader可以读取IDE默认编码格式(UTF-8)的文件
    FileReader读取系统默认编码(中文GBK)会产生乱码���
 */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\item\\stream\\我是GBK文件.txt");
        int len = 0;
        while((len = fr.read()) != -1){
            //System.out.println(len);      //65533  65533  65533
            System.out.println((char)len);      //���
        }
        fr.close();
    }
}