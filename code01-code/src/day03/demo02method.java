package day03;
/*
目标：使用方法的格式输出一个矩形

    1.使用for循环先实现结果
    2.注意方法的格式
 */

/*
public class demo02method {
    public static void main(String[] args) {    //快捷方式 psvm
        for (int j = 0; j < 5; j++) {           //快捷输出方式 5.forj
            for (int i = 0; i < 10; i++) {
                System.out.print("*");        //去掉ln，这10个在同一行输出
            }
            System.out.println();       //什么都不输出，起换行作用
        }
    }
}
*/

public class demo02method {
    public static void main(String[] args) {    //快捷方式 psvm
        printmethod();
    }
    public static void printmethod() {
        for (int j = 0; j < 5; j++) {           //快捷输出方式 5.forj
            for (int i = 0; i < 10; i++) {
                System.out.print("*");        //去掉ln，这10个在同一行输出
            }
            System.out.println();       //什么都不输出，起换行作用
        }
    }
}


