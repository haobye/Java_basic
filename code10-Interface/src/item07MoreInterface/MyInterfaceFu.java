package item07MoreInterface;

public interface MyInterfaceFu {

    public default void method() {
        System.out.println("接口的默认方法");
    }

}
