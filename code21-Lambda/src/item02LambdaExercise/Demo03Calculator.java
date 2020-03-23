package item02LambdaExercise;
/*
练习三：
    Lambda表达式【有参数、有返回值】的练习
    给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
    使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class Demo03Calculator {
    public static void main(String[] args) {
        //1、调用invokeCalc方法，接口参数可以使用匿名内部类
        invokeCalc(13, 5, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        //2、使用Lambda
        invokeCalc(4, 6, (int a, int b)->{
            return a+b;
        });

        //3、优化省略Lambda
        invokeCalc(5, 15, (a, b)-> a + b);
    }

    /*
    定义一个方法，参数为两个int类型整数，接口。
    调用Calculator接口中的calc方法，计算两个整数的和
     */
    public static void invokeCalc(int a, int b, Calculator c){
        int sum = c.calc(a, b);
        System.out.println("result : "+sum);
    }
}
