package item07Properties;

import java.util.Properties;
import java.util.Set;

/*
java.util.【Properties集合】 extends Hashtable<k,v> implements Map<k,v>
    Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。
    Properties集合是一个唯一和IO流相结合的集合
        可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储====Demo02
        可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对),读取到集合中使用====Demo03

属性列表中每个键及其对应值都是一个字符串。
    Properties集合是一个双列集合,key和value默认都是字符串
 */

public class Demo01PropBasic {
    /*
        使用Properties集合存储数据,遍历取出Properties集合中的数据
        Properties集合是一个双列集合,key和value默认都是字符串
        Properties集合有一些操作字符串的特有方法
            Object setProperty(String key, String value) 调用 Hashtable 的方法 put。
            Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串,此方法相当于Map集合中的keySet方法
            String getProperty(String key) 通过key找到value值,此方法相当于Map集合中的get(key)方法
     */
    public static void main(String[] args) {
        //1、创建Properties对象
        Properties prop = new Properties();

        //2、使用setProperty来添加数据
        prop.setProperty("赵丽颖", "167");
        prop.setProperty("迪丽热巴", "177");
        prop.setProperty("赵允儿", "173");

        //3、使用stringPropertyNames把Properties集合中的键取出,存储到一个Set集合中
        Set<String> set = prop.stringPropertyNames();

        //4、遍历Set集合,取出Properties集合的每一个键
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"==="+value);
        }
    }
}
