package item08MoreInherit;
/*
本类中的接口有四个：
methodA
methodB
methodCommon（共有的）
method
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB {

    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
