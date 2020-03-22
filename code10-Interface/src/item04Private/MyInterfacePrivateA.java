package item04Private;
/*
问题描述：
我们需要抽取一个共有方法，用来解决两个默认方法之间重复代码的问题。
但是这个共有方法不应该让实现类使用，应该是私有化的。


解决方案：
(从Java 9开始，接口中允许定义私有方法。)

    1、普通私有方法，解决多个默认方法之间重复代码问题。
        格式：
            private 返回值类型 方法名称(参数列表) {
                //方法体
            }
    2、第二点在：MyInterfacePrivateB
 */
public interface MyInterfacePrivateA {

    public default void methodDefault1() {
        System.out.println("默认方法1");
        methodCommon();
    }

    public default void methodDefault2() {
        System.out.println("默认方法2");
        methodCommon();
    }

//    public default void methodCommon() {
//    //改变为私有方法
    private void methodCommon() {
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }

}
