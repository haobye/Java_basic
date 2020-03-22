package day06;

public class demo06phonereturn {
    public static void main(String[] args) {
        demo04phone two = getphone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static demo04phone getphone() {
        demo04phone one = new demo04phone();
        one.brand = "apple";
        one.price = 22222.0;
        one.color = "black";
        return one;
    }
}
