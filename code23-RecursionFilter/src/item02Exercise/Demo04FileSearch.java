package item02Exercise;

import java.io.File;

/*
练习:
    遍历F:\\item文件夹,及item文件夹的子文件夹，输出以.java结尾的文件
 */
public class Demo04FileSearch {
    public static void main(String[] args) {
        File dir = new File("F:\\item");
        getAllFile(dir);
    }

    private static void getAllFile(File dir) {
        File[] files = dir.listFiles();
        for (File f : files) {
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                /*//1、将File类型的f转换为字符串类型
                String s = f.getPath();
                //String s = f.getName();
                //String s = f.toString();
                //2、将字符串小写
                String str = s.toLowerCase();
                //3、判断是否是以.java结尾的
                boolean b = str.endsWith(".java");
                //4、若是，则输出
                if(b){
                    System.out.println(str);
                }*/

                //将以上使用链式表达式来写
                if(f.toString().toLowerCase().endsWith(".java")){
                    System.out.println(f);
                }
            }
        }
    }
}
