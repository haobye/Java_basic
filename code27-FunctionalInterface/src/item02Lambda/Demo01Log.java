package item02Lambda;
/*
【日志案例】
    发现以下代码存在的一些性能浪费的问题:
        调用showLog方法,传递的第二个参数是一个拼接后的字符串
        先把字符串拼接好,然后在调用showLog方法
            showLog方法中如果传递的日志等级不是1级
            那么就不会输出拼接后的字符串
            所以感觉字符串就白拼接了,存在了浪费
 */
public class Demo01Log {
    //定义一个根据日志级别显示日志信息的方法
    public static void showLog(int level, String message){
        //如果是一级，则输出日志信息
        if(level == 1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "Word";
        String msg3 = "Java";

        //调用showLog方法
        showLog(1, msg1+msg2+msg3);
        System.out.println("==================");
        showLog(2, msg1+msg2+msg3);
    }
}
