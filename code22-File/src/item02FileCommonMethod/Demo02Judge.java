package item02FileCommonMethod;

import jdk.nashorn.api.tree.ForInLoopTree;
import java.io.File;

/*      judge 判断

File类判断功能的方法
    - public boolean exists() ：此File表示的文件或目录是否实际存在。
    - public boolean isDirectory() ：此File表示的是否为目录。
    - public boolean isFile() ：此File表示的是否为文件。
                后两个方法使用前提,【路径（path.exists）必须是存在的】,否则都返回false。
 */
public class Demo02Judge {
    public static void main(String[] args) {
//        show01exists();
//        show02isDirectory();
        show03isFile();
    }

    /*
    public boolean isFile()
        用于判断构造方法中给定的路径是否以文件结尾，即是否为文件
            是:true
            否:false
     */
    private static void show03isFile() {
        File f1 = new File("F:\\item\\directory\\a.txt");
        //先判断一下路径是否存在
        if(f1.exists()){
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }

        File f2 = new File("F:\\item\\noHave\\no.txt");
        if(f2.exists()){
            System.out.println("不存在路径，无法执行到这里");
            System.out.println(f2.isFile());
            System.out.println(f2.isDirectory());
        }
    }

    /*
    public boolean isDirectory()
        用于判断构造方法中给定的路径是否以文件夹结尾，即是否是目录
            是:true
            否:false
     */
    private static void show02isDirectory() {
        File f1 = new File("F:\\item\\directory");
        //先判断一下路径是否存在
        if(f1.exists()){
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }
    }

    /*
    public boolean exists()
        用于判断构造方法中的路径（文件或目录）是否存在
            存在:true
            不存在:false
     */
    private static void show01exists() {
        File f1 = new File("F:\\item\\directory");
        System.out.println(f1.exists());
        File f2 = new File("F:\\item\\noHave");
        System.out.println(f2.exists());
    }
}
