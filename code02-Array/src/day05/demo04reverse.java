package day05;
// day05_16 原始方法 使数组反转

public class demo04reverse {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==================");


        for (int left = 0, right = array.length-1; left < right; left++, right--) {
            int temp = array[right];
            array[right] = array[left];
            array[left] = temp;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        System.out.println("==================");
    }
}
