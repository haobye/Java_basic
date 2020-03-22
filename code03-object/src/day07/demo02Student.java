package day07;

public class demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        //这就是构造方法的调用方法，new
        System.out.println("================");

        Student stu2 = new Student("韩崇浩",18);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        //需要改变对象当中的成员变量时，仍然需要使用setXxx的方法
        stu2.setAge(19);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
    }
}
