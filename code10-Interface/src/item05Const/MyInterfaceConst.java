package item05Const;
/*
常量const

接口当中也可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰。
从效果上看，这其实就是接口的【常量】。
格式：
    public static final 数据类型 常量名称 = 数据值。
备注：
    public 表示不管接口内外都可以使用
    static 静态
    final  一旦使用，说明不可改变

注意事项：
    0、将class替换为interface。
    1、接口中的public static final可以省略，注意，不写也是这样。
    2、接口中的常量必须进行赋值，不能不赋值。
    3、接口中的常量名称使用完全的大写字母，使用下划线进行分割。(推荐使用)
 */
public interface MyInterfaceConst {

    //常量
//    public static final int num = 20;
    public static final int NUM_OF_MY_CLASS = 30;
}
