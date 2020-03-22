package day04;
//打印指定次数的Helloword

public class demo03print {
    public static void main(String[] args) {
        printhello(3);
    }
    public static void printhello(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Hello Word !!!    " + (i+1));
        }
    }
}
