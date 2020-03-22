package day05;
//求出数组中的最大值

public class demo03item {
    public static void main(String[] args) {
        int[] array = new int[] {23,54,57,78000,34,71};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值为 >>> " + max);
    }
}
