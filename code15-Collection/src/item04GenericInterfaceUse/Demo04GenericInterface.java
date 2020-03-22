package item04GenericInterfaceUse;
/*
测试含有泛型的接口
 */
public class Demo04GenericInterface {
    public static void main(String[] args) {
        //第一种
        //创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();   //GenericInterfaceImpl1中定死啦是String类型
        gi1.method("字符串");

        //第二种
        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<String> gi2 = new GenericInterfaceImpl2<>();
        gi2.method("String类型-字符串");
        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(8.9);
        //Double类型-小数
    }
}
