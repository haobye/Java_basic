package item05StringOutputStream;

import java.io.FileWriter;
import java.io.IOException;

/*
flush方法和close方法的区别
    - flush ：刷新缓冲区，流对象可以继续使用。【待机】
    - close:  先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。【关机】
 */
public class Demo02FlushClose {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\item\\c.txt");
        fw.write(66);

        fw.flush();
        //刷新后可以继续写入
        fw.write(67);

        fw.close();
        //关闭后再写入就报错 java.io.IOException: Stream closed
        fw.write(68);
    }
}
