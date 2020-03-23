package item06Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
JDK9新特性
    try的前边可以定义流对象
    在try后边的()中可以直接引入流对象的名称(变量名)
    在try代码执行完毕之后,流对象也可以释放掉,【不用写finally】

                A a = new A();
                B b = new B();
                try(a,b){
                    可能会产出异常的代码
                }catch(异常类变量 变量名){
                    异常的处理逻辑
                }
 */
public class Demo03JDK9 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\item\\fire.png");
        FileOutputStream fos = new FileOutputStream("F:\\item\\1.png");

        try(fis;fos){
            int len = 0;
            while((len = fis.read())!=-1){
                fos.write(len);
            }
        }catch(IOException e){
            System.out.println(e);
        }

        //在写入就报错啦，因为已经关闭啦  Stream Closed
        fos.write(66);

    }
}
