package day06;

public class demo10Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("韩崇浩");
        stu.setAge(18);
        stu.setMale(true);

        System.out.println("姓名是" + stu.getName());
        System.out.println("是不是爷们" + stu.isMale());
    }
}
