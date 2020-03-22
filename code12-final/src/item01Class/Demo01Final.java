package item01Class;
/*
final关键字代表 最终、不可改变的。

常见四种用法：
    1、用来修饰一个类。
    2、用来修饰一个方法。
    3、还可以用来修饰一个局部变量。
    4、还可以用来修饰一个成员变量。
 */
public class Demo01Final {

    public static void main(String[] args) {
        final int num = 20;
        System.out.println(num);

//        num = 20;
//        num = 250;  //都是错误写法

        //一旦使用final终身不能改变
        //“一次赋值，终身不变”
        final int num2;
        num2 = 200;     //正确写法，只要确保有唯一一个值即可。


    }

}
