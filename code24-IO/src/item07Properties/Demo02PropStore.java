package item07Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
Properties集合中的方法【store】
        作用：【【把集合中的临时数据,持久化写入到硬盘中存储】】

    void store(OutputStream out, String comments)
    void store(Writer writer, String comments)
        参数:
            OutputStream out:字节输出流,不能写入中文
            Writer writer:字符输出流,可以写中文
            String comments:【注释】,用来解释说明保存的文件是做什么用的
                    不能使用中文,会产生乱码,默认是Unicode编码
                    一般使用""空字符串

使用步骤:
    1.创建Properties集合对象,添加数据
    2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地
    3.使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
    4.释放资源
 */
public class Demo02PropStore {
    public static void main(String[] args) throws IOException {
        //1.创建Properties集合对象,添加数据
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "167");
        prop.setProperty("迪丽热巴", "177");
        prop.setProperty("赵允儿", "173");

        //2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地
        FileWriter fw = new FileWriter("F:\\item\\prop.txt");

        //3.使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
        prop.store(fw, "save data");    //后面是注释

        //4.释放资源
        fw.close();
    }
}
