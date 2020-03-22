package day04;
/*
判断两个数字是否相同
 */
public class demo01same {
    public static void main(String[] args) {
        System.out.println(issame(10, 20));
    }
    public static boolean issame(int a, int b) {
        //第一种：if-else
        /*boolean same;
        if (a == b){
            same = true;
        } else {
            same = false;
        }
        return same;*/

        //第二种：三元表达式
        /*boolean same;
        same = a == b ? true: false;
        return same;*/

        //第三种：直接判断（因为是布尔类型）
        /*boolean same = a == b;
        return same;*/

        //第四种：最简便
        return a == b;
    }
}
