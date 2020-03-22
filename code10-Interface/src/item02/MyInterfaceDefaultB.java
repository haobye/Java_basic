package item02;

public class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void methodAbs() {
        System.out.println("实现抽象方法，bbb");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B 覆盖重写了 接口的默认方法");
    }
}
