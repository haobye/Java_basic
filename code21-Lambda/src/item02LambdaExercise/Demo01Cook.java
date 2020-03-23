package item02LambdaExercise;
/*
exercise 练习     invoke 调用

练习一：
    给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且【无参数、无返回值】。
    使用Lambda的标准格式调用invokeCook方法，打印输出“吃饭啦！”字样
*/
public class Demo01Cook {
    public static void main(String[] args) {
        //传统做法：使用匿名内部类调用invokeCook方法，参数是Cook接口。
        invokeCook(new Cook(){
            @Override
            public void makeFood() {
                System.out.println("吃饭啦！");
            }
        });

        //简介做法：使用Lambda，简化内部类的书写。
        invokeCook(()->{
            System.out.println("吃饭喽。");
        });

        //省略写法：
        invokeCook(()-> System.out.println("吃饭吧"));
    }

    //定义一个方法，调用接口中的方法，参数传递Cook接口
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
