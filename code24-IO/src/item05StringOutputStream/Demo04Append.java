package item05StringOutputStream;

import java.io.FileWriter;
import java.io.IOException;

/*
【续写】和【换行】
    1、续写,追加写:使用两个参数的构造方法
        FileWriter(String fileName, boolean append)
        FileWriter(File file, boolean append)
            参数:
                String fileName,File file:写入数据的目的地
                boolean append:续写开关 true:不会创建新的文件覆盖源文件,可以续写; false:创建新的文件覆盖源文件
     2、换行:换行符号
        windows:\r\n
        linux:/n
        mac:/r
 */
public class Demo04Append {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\item\\line.txt", true);   //true可追加写入
        for (int i = 1; i < 11; i++) {
            fw.write("Hello Word "+i+"\r\n");
        }
        fw.close();
    }
}
