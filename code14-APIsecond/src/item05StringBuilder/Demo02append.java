package item05StringBuilder;

public class Demo02append {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder();

        //使用append的方法添加数据
//        StringBuilder bu2 = bu.append("abc");   //相当于将bu2赋值给bu
//        System.out.println(bu);
//        System.out.println(bu2);
//        System.out.println(bu==bu2);  //引用类型比较的是地址值  //true

        //使用append方法不需要接收返回值
//        bu.append("sbc");
//        bu.append(234);
//        bu.append(0.8);
//        bu.append("中国");
//        System.out.println(bu);

        //链式编程：方法返回值是一个对象，可以继续调用方法
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase());
        bu.append("jkl").append(222).append(0.9).append("中国");
        System.out.println(bu);
    }
}
