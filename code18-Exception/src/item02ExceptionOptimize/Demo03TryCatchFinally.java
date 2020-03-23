package item02ExceptionOptimize;

import java.io.IOException;

/*
【finally】代码块
注意:
    1.finally不能单独使用,必须和try一起使用
    2.finally一般用于资源释放(资源回收),无论程序是否出现异常,【【最后都要资源释放(IO)】】

格式:
    try{
        可能产生异常的代码
    }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
        异常的处理逻辑,异常异常对象之后,怎么处理异常对象
        一般在工作中,会把异常的信息记录到一个日志中
    }finally{
        无论是否出现异常都会执行
    }
 */
public class Demo03TryCatchFinally {

    public static void main(String[] args) {
        try{
            readFile("c:\\file.tx");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            System.out.println("资源释放");
        }
    }

    public static void readFile(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题,读取文件");
    }

}
