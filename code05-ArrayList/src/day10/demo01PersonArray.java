package day10;
/*
定义一个数组，用来存储三个Person对象。

数组有一个缺点：一旦创建，程序运行期间，数组长度不可以发生改变
 */
public class demo01PersonArray {
    public static void main(String[] args) {
        //创建一个长度为三的数组
        Person[] array = new Person[3];

        //创建对象
        Person one = new Person("韩",17);
        Person two = new Person("崇",18);
        Person three = new Person("浩",19);

        //将每一个对象的地址值赋值给数组
        array[0] = one;
        array[1] = two;
        array[2] = three;

        //数组里面现在存储的是地址值
        System.out.println(array[0]);

        //使用getter得到具体值
        System.out.println(array[0].getName());
    }
}
