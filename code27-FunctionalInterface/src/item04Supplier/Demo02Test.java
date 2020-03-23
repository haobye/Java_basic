package item04Supplier;

import java.util.function.Supplier;

/*
【练习】：求数组元素最大值
    使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
    提示：接口的泛型请使用java.lang.Integer类。
 */
public class Demo02Test {
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {10,67,34,-17,92,-29,31};
        //调用getMax方法
        int finMax = getMax(() -> {
            int max = arr[0];
            for (int m : arr) {
                if(m > max){
                    max = m;
                }
            }
            return max;
        });
        System.out.println("最大值为：" + finMax);
    }
}
