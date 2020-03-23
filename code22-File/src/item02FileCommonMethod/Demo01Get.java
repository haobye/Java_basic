package item02FileCommonMethod;

import java.io.File;

/*
File类获取功能的方法：
    - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
    - public String getPath() ：将此File转换为路径名字符串。
    - public String getName()  ：返回由此File表示的文件或目录的名称。
    - public long length()  ：返回由此File表示的【文件的长度】，即时大小。
 */
public class Demo01Get {
    public static void main(String[] args) {
//        show01getAbsolutePath();
//        show02getPath();
//        show03getName();
        show04length();
    }

    /*
    public long length()
        获取的是构造方法指定的文件的大小,以字节为单位
            注意:
                1、文件夹是没有大小概念的,不能获取文件夹的大小
                2、如果构造方法中给出的路径不存在,那么length方法返回0
     */
    private static void show04length() {
        File f1 = new File("F:\\item\\b.txt");   //17字节，只有一行数字
        long size1 = f1.length();
        System.out.println(size1);

        File f2 = new File("F:\\item\\no.txt");   //没有文件，返回0
        long size2 = f2.length();
        System.out.println(size2);

        File p1 = new File("F:\\item\\directory");   //路径没有大小，返回0
        long size3 = p1.length();
        System.out.println(size3);
    }

    /*
    public String getName()
        获取的是路径的结尾部分(文件/文件夹)
     */
    private static void show03getName() {
        File f1 = new File("F:\\item\\directory\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);

        File f2 = new File("F:\\item\\directory");
        String name2 = f2.getName();
        System.out.println(name2);
    }

    /*
    public String getPath() ：将此File转换为路径名字符串。
        获取传递的路径，不改变

            toString方法调用的就是getPath方法：
                public String toString() {
                    return getPath();
                }
     */
    private static void show02getPath() {
        File f1 = new File("F:\\item\\directory");
        String path1 = f1.getPath();
        System.out.println(path1);
        System.out.println(f1);
        System.out.println(f1.toString());

        System.out.println("---------------------------------");
        File f2 = new File("F:\\item\\directory\\a.txt");
        String path2 = f2.getPath();
        System.out.println(path2);
    }

    /*
    public String getAbsolutePath()
        无论路径是绝对的还是相对的,getAbsolutePath方法返回的都是绝对路径
     */
    private static void show01getAbsolutePath() {
        File f1 = new File("F:\\item\\directory\\a.txt");
        File absoluteFile1 = f1.getAbsoluteFile();
        System.out.println(absoluteFile1);

        File f2 = new File("a.txt");
        File absoluteFile2 = f2.getAbsoluteFile();
        System.out.println(absoluteFile2);
    }
}
