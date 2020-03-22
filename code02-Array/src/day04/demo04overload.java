package day04;
/*
方法的重载overload：
    1.多个方法的名称一样，但是参数列表不一样。
    2.好处：只需要记住唯一一个方法名称，即可实现多个类似的功能。

方法的重载与下列因素有关：
    1.参数个数不同
    2.参数类型不同
    3.参数的多类型顺序不同

方法的重载与那些  无关  ：
    ## 与参数名称无关
    ## 与返回值无关(单独调用不要返回值)
 */
public class demo04overload {
    public static void main(String[] args) {
        System.out.println(sum(2, 4));
        System.out.println(sum(2, 4, 4));
        //System.out.println(sum(2, 4, 4, 5, 5));   没有五个数相加，则报错
    }

    //参数的多类型顺序不同、、、
    public static int sum(double a, int b){
        return (int) (a+b);
    }
    //参数的多类型顺序不同、、、
    public static int sum(int a, double b){
        return (int) (a+b);
    }


    //参数类型不同
    public static int sum(double a, double b){
        return (int) (a+b);
    }


    //参数个数不同
    public static int sum(int a, int b){
        System.out.println("两个数相加");
        return a+b;
    }
    public static int sum(int a, int b, int c){
        System.out.println("三个数相加");
        return a+b+c;
    }
    public static int sum(int a, int b, int c, int d){
        System.out.println("四个数相加");
        return a+b+c+d;
    }
}
