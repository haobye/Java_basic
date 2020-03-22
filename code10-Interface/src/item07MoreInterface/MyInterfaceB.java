package item07MoreInterface;

public interface MyInterfaceB {

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodConflict() {
        System.out.println("默认bbb");
    }
}
