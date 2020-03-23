package item06Exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
JDK7的新特性
    在try的后边可以增加一个(),在括号中可以定义流对象
    那么这个流对象的作用域就在try中有效
    try中的代码执行完毕,会自动把流对象释放,【不用写finally】

                    try(定义流对象;定义流对象....){
                        可能会产出异常的代码
                    }catch(异常类变量 变量名){
                        异常的处理逻辑
                    }
 */
public class Demo02JDK7 {
    public static void main(String[] args) {

        try(
                FileInputStream fis = new FileInputStream("F:\\item\\aaa.txt");
                FileOutputStream fos = new FileOutputStream("F:\\item\\bbb.txt");
                ){
            int len = 0;
            while((len = fis.read()) != -1){
                fos.write(len);
            }
        }catch(IOException e){
            System.out.println(e);
        }

    }
}
