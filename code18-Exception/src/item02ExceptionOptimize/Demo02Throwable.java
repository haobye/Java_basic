package item02ExceptionOptimize;

import java.io.IOException;

/*
Throwable类中有3个异常处理的方法

String getMessage()      返回此 throwable 的简短描述。
String toString()        返回此 throwable 的详细消息字符串。
void printStackTrace()   JVM打印异常对象,默认此方法,打印的异常信息是最全面的
 */
public class Demo02Throwable {

    public static void main(String[] args) {
        try{
            readFile("c:\\file.t");
        }catch(IOException e){
            /*System.out.println("文件后缀名不是.txt");*/
//            System.out.println(e.getMessage());  //简短
//            System.out.println(e.toString());  //重写Object中的toString方法  结果一致 --> System.out.println(e);
            e.printStackTrace();     //最详细的
        }
        System.out.println("后续代码");
    }

    private static void readFile(String filename) throws IOException {
        if(!filename.endsWith(".txt")){
            throw new IOException("后缀名错误");
        }
        System.out.println("文件正确，读取内容...");
    }

}
