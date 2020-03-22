package day11;
import java.util.ArrayList;
/*
如果希望向集合ArrayList中存储基本类型数据，必须使用基本类型对应的“包装类”

基本类型        包装类(都位于java.lang包下，所以不用导包)
byte            Byte
short           Short
int             Integer 【特殊】
long            Long
float           Float
double          Double
char            Character 【特殊】
boolean         Boolean

从JDK1.5+开始，支持自动装箱、自动拆箱
自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
 */

public class demo03ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ArrayList<Integer> list_int = new ArrayList<>();
        list_int.add(100);
        list_int.add(222);
        list_int.add(333);
        System.out.println(list_int);

        int res = list_int.get(0);
        System.out.println("第一个是：" + res);
    }
}
