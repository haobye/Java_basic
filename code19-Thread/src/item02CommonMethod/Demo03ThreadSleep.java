package item02CommonMethod;
/*
public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
    毫秒数结束之后,线程继续执行
 */
public class Demo03ThreadSleep {
    public static void main(String[] args) {
        for (int i = 1; i < 60; i++) {
            System.out.println(i);

            //每执行一次暂停1000毫秒，即一秒
            //静态方法，直接使用Thread点出来sleep，使用Alt+Enter将报错处理以下
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
