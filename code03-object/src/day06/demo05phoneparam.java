package day06;

public class demo05phoneparam {
    public static void main(String[] args) {
        demo04phone one = new demo04phone();
        one.brand = "han";
        one.price = 3456.45;
        one.color = "土豪金";
        method(one);
    }

    public static void method(demo04phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
