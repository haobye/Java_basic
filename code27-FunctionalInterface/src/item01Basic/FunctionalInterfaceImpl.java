package item01Basic;
/*
@Override注解：可以检测方法是否为重写的方法
 */
public class FunctionalInterfaceImpl implements FunctionalInterface {
    @Override
    public void method() {
        System.out.println("接口实现类中的method方法");
    }
}
