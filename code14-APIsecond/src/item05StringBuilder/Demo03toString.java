package item05StringBuilder;
/*
StringBuilder(字符串缓冲区)和String(字符串)可以相互转换。

String --> StringBuilder ：可以使用StringBuilder的构造方法
    StringBuilder(String str)构造一个字符串生成器，并初始化为指定的字符串内容。

StringBuilder --> String ：可以使用StringBuilder中的toString方法
    public String toString()将当前StringBuilder对象转换为String对象。
 */
public class Demo03toString {
    public static void main(String[] args) {
        //String --> StringBuilder
        String str = "hello";
        System.out.println("str:"+str);
        StringBuilder bu = new StringBuilder(str);
        //向StringBuilder中添加数据
        System.out.println("bu:"+bu.append(" word"));

        //StringBuilder --> String
        String s = bu.toString();
        System.out.println("s:"+s);
    }
}
