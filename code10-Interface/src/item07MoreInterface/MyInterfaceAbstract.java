package item07MoreInterface;

public abstract class MyInterfaceAbstract implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {

    }

    //没有覆盖重写所有接口的所有抽象方法，则本类也必须是一个抽象类
    /*@Override
    public void methodB() {

    }*/

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodConflict() {

    }


}
