package item01Exception;
/*
    异常的产生过程解析(分析异常的怎么产生的,如何处理异常)
 */
public class Demo02Produce {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
//        int index = 2;
        int index = 4;
        int result = getElement(arr, index);
        System.out.println(result);
    }

    //定义一个方法，获取数组指定索引处的方法
    public static int getElement(int[] arr, int i) {
        int result = arr[i];
        return result;
    }
}
