package item06Exception;
/*
在jdk1.7之前使用try catch finally 处理流中的异常

        try{
            可能会产出异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }finally{
            一定会指定的代码
            资源释放
        }
 */

import java.io.FileWriter;
import java.io.IOException;

public class Demo01TryCatchFinally {
    public static void main(String[] args) {
        //提高变量fw的作用域,让finally可以使用
        //变量在定义的时候,可以没有值,但是使用的时候必须有值，空值就可以
        FileWriter fw = null;
        try{
            fw = new FileWriter("W:\\F:\\item\\hi.txt", true);  //执行失败，fw没有值，fw.close()就会报错
            for (int i = 0; i < 10; i++) {
                fw.write("Hi "+i+"\r\n");
            }
        }catch(IOException e){
            System.out.println(e);
        }finally{
            //再次使用tryCatch
            //先判断fw是否为空值，不是则执行以下代码
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
