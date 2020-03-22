package item07MoreInterface;

public class MyInterfaceImplement implements MyInterfaceA,MyInterfaceB {

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了Abs重名方法");
    }

    @Override
    public void methodConflict() {
        System.out.println("对多个接口中冲突的方法进行重写");
    }
}
