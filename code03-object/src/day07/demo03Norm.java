package day07;

public class demo03Norm {
    public static void main(String[] args) {

        Norm n1 = new Norm();
        n1.setName("小帅哥");
        n1.setAge(13);
        System.out.println("姓名：" + n1.getName() + "，年龄：" + n1.getAge());
        System.out.println("=================================");

        Norm n2 = new Norm("大帅哥", 19);
        System.out.println("姓名：" + n2.getName() + "，年龄：" + n2.getAge());
        n2.setAge(20);
        System.out.println("姓名：" + n2.getName() + "，年龄：" + n2.getAge());
    }
}
