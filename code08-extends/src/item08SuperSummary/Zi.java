package item08SuperSummary;
/*
super典型用法有三种。
 */
public class Zi extends Fu {

    int num = 20;
    public void method() {
        System.out.println(num);
        System.out.println(super.num);  //访问父类中的成员变量num
    }

    public Zi() {
       super();     //访问父类构造方法
    }

    public void call() {
        super.call();       //访问父类中的成员方法call
    }

}
