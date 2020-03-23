package item02Exercise;

import java.io.File;
/*
练习:
    递归打印多级目录

需求:
    遍历F:\\item文件夹,及item文件夹的子文件夹
 */
public class Demo03PrintDirectory {
    public static void main(String[] args) {
        File dir = new File("F:\\item");
        getAllFile(dir);
    }

    public static void getAllFile(File dir) {
        System.out.println(dir);  //打印被遍历的目录
        File[] files = dir.listFiles();
        for (File f : files) {
            //对遍历得到的对象进行判断，若是目录则继续遍历
            if(f.isDirectory()){
                //使用递归
                getAllFile(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
