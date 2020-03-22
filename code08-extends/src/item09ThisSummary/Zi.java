package item09ThisSummary;
/*
this的三种使用方法：
*/
public class Zi extends Fu {
    int num = 10;
    /*注意事项：
        A:this(...)调用也必须是构造方法的第一个语句，并且是唯一一个。
        B:super和this两种构造调用，不能同时使用
    */
    public Zi() {
        this(10);   //本类的无参构造，调用本类的有参构造
//        super();    //错误写法！  这一行不再赠送
    }
    public Zi(int a) {
        this(11,22);    //本类的有参构造，调用本类的多参
    }
    public Zi(int a, int b) {
        super();
    }

    public void method() {
        int num = 20;
        System.out.println(num);   //20
        System.out.println(this.num);  //10     //1、访问本类成员变量
        System.out.println(super.num);   //5
    }

    public void methodA() {
        System.out.println("aaa");
    }

    public void methodB() {
        this.methodA();  //2、访问本类的另一个成员方法
        System.out.println("bbb");
    }

}
