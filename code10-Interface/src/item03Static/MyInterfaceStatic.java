package item03Static;
/*
从Java 8开始，接口当中允许定义静态方法。
格式：
    public static 返回值类型 方法名称(参数列表) {
        //方法体
    }
提示：
    就是将abstract或者default 换成static即可，带上方法体。
 */
public interface MyInterfaceStatic {

    public static void method() {
        System.out.println("接口静态方法");
    }

}
