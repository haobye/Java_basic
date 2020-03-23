package item03ExceptionAttention;
/*
    如果finally有return语句,永远返回finally中的结果,避免该情况.       (即以下的情况)
 */
public class Demo02FinallyReturn {

    public static void main(String[] args) {
        int a = showGet();
        System.out.println(a);
    }

    private static int showGet() {
        int num = 0;
        try{
            return num;
        }catch(Exception e){
            System.out.println(e);
        }finally {
            //一定会执行的代码
            num = 100;
            return num;
        }
    }

}
