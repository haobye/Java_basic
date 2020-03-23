package item02FileCommonMethod;

import java.io.File;

/*
traverse 遍历

File类遍历(文件夹)目录功能
        - public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。【路径】
        - public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。【名称】

注意:
    list方法和listFiles方法遍历的是构造方法中给出的目录
    如果构造方法中给出的目录的路径不存在,会抛出空指针异常
    如果构造方法中给出的路径不是一个目录,也会抛出空指针异常
        隐藏文件及文件夹也会被遍历出来。
 */
public class Demo04Traverse {
    public static void main(String[] args) {
        show01list();
//        show02listFiles();
    }

    /*
    public File[] listFiles()
        遍历构造方法中给出的目录,会获取目录中所有的文件/文件夹的【路径】,
          把文件/文件夹封装为File对象,多个File对象存储到File数组中
     */
    private static void show02listFiles() {
        File file = new File("F:\\item");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    /*
    public String[] list()
        遍历构造方法中给出的目录,会获取目录中所有文件/文件夹的【名称】,
          把获取到的多个名称存储到一个String类型的数组中
     */
    private static void show01list() {
        File file = new File("F:\\item");     //正常
//        File file = new File("F:\\item\\a.txt");        //不能遍历文件 空指针异常 NullPointerException
//        File file = new File("F:\\item\\noHave");       //路径错误 空指针异常 NullPointerException
        String[] arr = file.list();
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
