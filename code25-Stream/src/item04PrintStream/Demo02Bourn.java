package item04PrintStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*  【目的地 bourn】

可以改变输出语句的目的地(打印流的流向)，输出语句,默认在控制台输出
    使用【System.setOut】方法改变输出语句的目的地改为参数中传递的打印流的目的地
        static void setOut(PrintStream out)
        重新分配“标准”输出流。
 */
public class Demo02Bourn {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我在控制台打印");

        PrintStream ps = new PrintStream("F:\\item\\stream\\打印流的目的地.txt");
        System.setOut(ps);
        System.out.println("我在目的地中打印");

        ps.close();
    }
}
