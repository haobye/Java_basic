package item02Exercise;
/*
练习:
    使用递归计算1-n之间的和

定义一个方法,使用递归计算1-n之间的和
    1+2+3+...+n
    n+(n-1)+(n-2)+...+1
        已知:最大值:n
             最小值:1
        使用递归必须明确:
            1.递归的结束条件:获取到1的时候结束
            2.递归的目的:获取下一个被加的数字(n-1)
 */
public class Demo01Sum {
    public static void main(String[] args) {
        int result = getSum(100);
        System.out.println(result);
    }

    public static int getSum(int n) {
        //到1的时候返回1，并且停止
        if(n == 1){
            return 1;
        }
        //否则就返回 当前数+之前的总和
        return n + getSum(n-1);
    }
}
