package item03Filter;

import java.io.File;
import java.io.FileFilter;
/*
创建过滤器FileFilter的实现类,重写过滤方法accept,定义过滤规则  【配合Demo01使用】  【Demo02使用匿名内部类】

过滤的规则:
    在accept方法中,判断File对象是否是以.java结尾
    是就返回true
    不是就返回false
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {

        //判断若是文件夹，则返回继续遍历
        if(pathname.isDirectory()){
            return true;
        }

        //不是文件夹，则判断若是以.java结尾的就返回true
        return pathname.toString().toLowerCase().endsWith(".java");

    }
}
