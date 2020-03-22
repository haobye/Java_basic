package item04Private;
/*
解决方案：
(从Java 9开始，接口中允许定义私有方法。)

    1、第一点在：MyInterfacePrivateB

    2、静态私有方法，解决多个静态方法之间重复代码问题。
        格式：
            private static 返回值类型 方法名称(参数列表) {
                //方法体
            }
 */
public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodStaticCommon();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodStaticCommon();
    }

    private static void methodStaticCommon() {
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }

}
