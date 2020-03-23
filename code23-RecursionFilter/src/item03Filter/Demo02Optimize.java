package item03Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
【【第二个】】FilenameFilter
File[] listFiles(FilenameFilter filter)
    java.io.FilenameFilter接口:实现此接口的类实例可用于过滤器文件名。
        作用:【用于过滤【文件名称】】
        抽象方法:用来过滤文件的方法
            boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中。
                参数:File dir:构造方法中传递的被遍历的目录
                     String name:使用ListFiles方法遍历目录,获取的每一个文件/文件夹的名称

【注意】:
    两个过滤器接口是没有实现类的,需要我们自己写实现类,重写过滤的方法accept,在方法中自己定义过滤的规则
 */
public class Demo02Optimize {
    public static void main(String[] args) {
        getAllFiles(new File("F:\\item"));
    }

    private static void getAllFiles(File dir) {

        /*//使用匿名内部类
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.toString().toLowerCase().endsWith(".java");  //或者
            }
        });*/
        //使用Lambda表达式优化一下
        /*File[] files = dir.listFiles((File pathname) -> {
                return pathname.isDirectory() || pathname.toString().toLowerCase().endsWith(".java");
            });*/
        //最优
        //File[] files = dir.listFiles((File pathname) -> pathname.isDirectory() || pathname.toString().toLowerCase().endsWith(".java"));


        /*//使用第二种FilenameFilter方法
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File path, String name) {
                //path 路径， name 文件名      使用new File()组合在一起判断是否是目录
                return new File(path, name).isDirectory() || name.toString().toLowerCase().endsWith(".java");
            }
        });*/

        /*//使用Lambda表达式简化一下（FilenameFilter接口中只有一个抽象方法）
        File[] files = dir.listFiles((File path, String name)->{
            return new File(path, name).isDirectory() || name.toString().toLowerCase().endsWith(".java");
        });*/

        //使用Lambda继续优化
        File[] files = dir.listFiles((path, name) -> new File(path, name).isDirectory() || name.toString().toLowerCase().endsWith(".java"));


        for (File f : files) {
            if(f.isDirectory()){
                getAllFiles(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
