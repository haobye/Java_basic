package item03Local;

public class Demo03Final {

    public static void main(String[] args) {
        //对于基本类型来说，不可变的是数据内容。
        //对于引用类型来说，不可变的是数据地址值。
        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        System.out.println("***");
        Student stu2 = new Student("阿森纳");
        System.out.println(stu2);
        System.out.println(stu2.getName());

        System.out.println("====================");
        final Student stu3 = new Student("高圆圆");
//        stu3 = new Student("赵又廷");  //地址值不可改变
        stu3.setName("高圆圆圆圆圆");
        System.out.println(stu3.getName());
    }

}
