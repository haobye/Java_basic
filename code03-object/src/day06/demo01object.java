package day06;

import java.util.Arrays;

/*
使用实例对比面向过程和面向对象
输出[1,2,3,4]
 */
public class demo01object {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        //面向过程：每个步骤都亲历亲为
        System.out.print("[");
        for (int k = 0; k < array.length; k++) {
            if (k == array.length-1) {
                System.out.println(array[k] + "]");
            } else {
                System.out.print(array[k] + ", ");
            }
        }
        System.out.println("===========================");


        //面向对象：找一个具有此功能的人来做这件事
        //JDK有一个Arrays类，其中的toString方法，可以直接就把数组变成想要的格式
        System.out.println(Arrays.toString(array));
    }
}
