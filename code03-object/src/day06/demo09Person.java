package day06;

public class demo09Person {
    public static void main(String[] args) {
        Person per = new Person();
        per.show();
        System.out.println("===========");

//        per.name = "韩崇浩";
//        per.age = -18;     //需要在Person.java中对age添加private进行修饰，阻止明显不合理的数。
//        per.show();     //age爆红是因为，不可以直接访问啦

        per.name = "韩崇浩";
//        per.setAge(19);
        per.setAge(-10);
        per.show();
    }
}
