package item01static;

public class demo02Student {
    public static void main(String[] args) {

        Student one = new Student("郭靖", 19);
        one.classroom = "10503教室";
        System.out.println("姓名：" + one.getName()
                + "， 年龄：" + one.getAge() + "， 教室：" + one.classroom
                + "， 学号：" + one.getId());


        Student two = new Student("黄蓉", 17);
        System.out.println("姓名：" + two.getName()
                + "， 年龄：" + two.getAge() + "， 教室：" + two.classroom
                + "， 学号：" + two.getId());

    }
}
