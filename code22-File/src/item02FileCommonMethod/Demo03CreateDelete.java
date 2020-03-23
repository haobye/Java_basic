package item02FileCommonMethod;

import java.io.File;
import java.io.IOException;

/*
File类创建删除功能的方法
    - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
    - public boolean delete() ：删除由此File表示的文件或目录。
    - public boolean mkdir() ：创建由此File表示的目录。
    - public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class Demo03CreateDelete {
    public static void main(String[] args) throws IOException {
        show01createNewFile();
        show02mkdirs();
//        show03delete();
    }

    /*
    public boolean delete()
        删除构造方法路径中给出的文件/文件夹
            返回值:布尔值
                true:文件/文件夹删除成功,返回true
                false:文件夹中有内容,不会删除返回false;构造方法中路径不存在false
    注意:
        delete方法是直接在硬盘删除文件/文件夹,【不走回收站】,删除要谨慎
     */
    private static void show03delete() {
        File f1 = new File("F:\\item\\b.txt");
        boolean result1 = f1.delete();
        System.out.println("删除b.txt："+result1);

        File p1 = new File("F:\\item\\directory\\one");
        boolean result2 = p1.delete();
        System.out.println("删除one目录："+result2);
    }

    /*
    public boolean mkdir() ：创建单级空文件夹
    public boolean mkdirs() ：既可以创建单级空文件夹,也可以创建多级文件夹
        返回值:布尔值
            true:文件夹不存在,创建文件夹,返回true
            false:文件夹存在,不会创建,返回false;构造方法中给出的路径不存在返回false
    注意:
        1.此方法只能创建文件夹,不能创建文件
     */
    private static void show02mkdirs() {
        File p1 = new File("F:\\item\\directory\\one");
        boolean mkdir1 = p1.mkdir();
        System.out.println("one目录："+mkdir1);

        File p2 = new File("F:\\item\\directory\\first\\second\\third");
        boolean mkdirs2 = p2.mkdirs();
        System.out.println("使用mkdirs最方便："+mkdirs2);
    }

    /*
    public boolean createNewFile()
        当参数文件不存在时，创建以参数为路径的一个新的空文件
            返回值:布尔值
                true:文件不存在,创建文件,返回true
                false:文件存在,不会创建,返回false
    注意:
        1.此方法【只能创建文件】,【不能创建文件夹】
        2.创建文件的【路径必须存在】,否则会抛出异常

            public boolean createNewFile() throws IOException
            createNewFile声明抛出了IOException,我们调用这个方法,就必须的处理这个异常,要么throws,要么trycatch
     */
    private static void show01createNewFile() throws IOException {
        File f1 = new File("F:\\item\\directory\\createNewFile.txt");
        boolean result1 = f1.createNewFile();
        System.out.println("新文件一："+result1);

        File f2 = new File("F:\\item\\directory\\新建文件夹");   //实际不是文件夹
        boolean result2 = f2.createNewFile();
        System.out.println("不要被名称迷惑，要看类型："+result2);
    }
}
