package item03Filter;

import java.io.File;
import java.io.FileFilter;

/*
练习:
    遍历F:\\item文件夹,及item文件夹的子文件夹，输出以.java结尾的文件
        我们使用Filter过滤来优化这个文件搜索问题。

在File类中有两个和ListFiles重载的方法,方法的参数传递的就是过滤器

【【第一个】】FileFilter
File[] listFiles(FileFilter filter)
    java.io.FileFilter接口:用于抽象路径名(File对象)的过滤器。
        作用:【用来过滤【文件】(File对象)】
        抽象方法:用来过滤文件的方法
            boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
                参数:File pathname:使用ListFiles方法遍历目录,得到的每一个文件对象

【注意】:
    两个过滤器接口是没有实现类的,需要我们自己写实现类,重写过滤的方法accept,在方法中自己定义过滤的规则
 */
public class Demo01Optimize {
    public static void main(String[] args) {
        getAllFiles(new File("F:\\item"));
    }

    private static void getAllFiles(File dir) {
        //使用第一种FileFilter方法
        //将过滤的接口作为参数，传给目录遍历
        File[] files = dir.listFiles(new FileFilterImpl());

        for (File f : files) {
            if(f.isDirectory()){
                getAllFiles(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
