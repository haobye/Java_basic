package item04System;

import java.util.Arrays;

/*
在System类的API文档中，常用方法有两个：
    2、public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        将数组中指定的数据拷贝到另一个数组中
    参数：
        src：源数组【的名称】
        srcPos：源数组要复制的起始位置（索引位置）
        dest：目标数组【的名称】
        destPos：目标数组复制的起始位置（索引位置）
        length：要复制的长度

练习：
    将src数组中前3个元素，复制到dest数组的前3个位置上
    复制元素前：
        src：[1,2,3,4,5]，dest：[6,7,8,9,10]
    复制元素后：
        src：[1,2,3,4,5]，dest：[1,2,3,9,10]
 */
public class Demo02arraycopy {
    public static void main(String[] args) {
        //定义原数组
        int[] src = {1,2,3,4,5};
        //定义目标数组
        int[] dest = {6,7,8,9,10};
        //输出原内容
        System.out.println("复制前："+ Arrays.toString(dest));
        //使用arraycopy方法，【搞清楚参数的意思】
        System.arraycopy(src,0,dest,0,3);
        //输出结果
        System.out.println("复制后："+ Arrays.toString(dest));
    }
}
