package day11;

import java.util.ArrayList;

/*
自定义三个学生对象，添加到集合，并遍历
 */
public class demo05item2 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<Student> list = new ArrayList<>();

        //定义三个学生对象
        Student one = new Student("欧阳锋", 30);
        Student two = new Student("李志峰", 68);
        Student three = new Student("张三丰", 89);

        //添加
        list.add(one);
        list.add(two);
        list.add(three);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);   //不要new对象，直接从列表中取出
            System.out.println("姓名：" + stu.getName() + "， 年龄：" + stu.getAge());
        }
    }
}
