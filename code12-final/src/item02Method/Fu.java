package item02Method;

public abstract class Fu {

    public final void method() {
        System.out.println("父类方法执行");
    }

    //对于类和方法来说，abstract和final不能一同写，会矛盾
    public abstract /*final*/ void methodAbs();
    //抽象，都抽象方法啦，哪还有方法体

}
