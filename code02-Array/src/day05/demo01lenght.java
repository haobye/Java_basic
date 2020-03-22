package day05;

public class demo01lenght {
    public static void main(String[] args) {

        int[] array = new int[] {2,5,7,9,9,5,3,2,4};
        int len = array.length;
        System.out.println("数组的长度为" + len);

        //数组的长度不能发生改变
        int[] array1 = new int[3];
        System.out.println(array1.length);  //3
        array1 = new int[5];
        System.out.println(array1.length);  //5
        //这里3变为5是因为，又重新在堆中new出来的一个，原先的还是3
    }
}
