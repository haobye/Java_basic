package item07MoreInterface;

public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodConflict() {
        System.out.println("默认aaa");
    }

}
