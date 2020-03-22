package item07StructureSuper;

public class Zi extends Fu {

    public Zi() {
//        super();    //这个若是不写则默认，若写有参，则这个就没有啦
        super(20);
        System.out.println("子类构造方法");
    }

    public void method() {
//        super();    //错误写法，只有子类构造方法才能调用父类构造方法。
    }

}
