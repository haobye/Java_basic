package item03Generic;
/*
测试含有泛型的方法
 */
public class Demo03GenericMethod {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gm = new GenericMethod();

        //调用泛型的方法，传递什么类型，泛型就是什么类型int,String,boolean,
        gm.methodNoKnow(10);
        gm.methodNoKnow("asdf");
        gm.methodNoKnow(true);
        gm.methodNoKnow(5.7);

        gm.methodStatic("静态方法，不建议创建对象使用");

        GenericMethod.methodStatic("直接使用 【类名.方法名()】 即可调用");
    }
}
