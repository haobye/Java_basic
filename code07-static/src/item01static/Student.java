package item01static;

public class Student {

    private String name;
    private int age;
    static String classroom;    //关键词，本类共用
    private int id; //学号
    private static int idprogram;   //设置学号自增

    public Student() {
        this.id = ++idprogram;

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idprogram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
