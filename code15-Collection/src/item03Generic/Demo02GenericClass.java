package item03Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //没有使用泛型（不写泛型，默认是Object类型）
        /*GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        String name = gc.getName();      //可使用Object类型接接收泛型的
        System.out.println(name);*/

        //创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(99);
        //可以设置名字为int类型的数字
        Integer name2 = gc2.getName();
        System.out.println(name2);

        //创建GenericClass对象，泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("小明");
        String name3 = gc3.getName();
        System.out.println(name3);
    }
}
