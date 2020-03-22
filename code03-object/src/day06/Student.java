package day06;
/*
对于基本类型当中的Boolean值，
Getter方法一定要写成isXxx的格式，
而Setter方法规则不变。
 */
public class Student {

    private String name;
    private int age;
    private boolean male;


    public void setMale(boolean m) {
        male = m;
    }
    public boolean isMale() {
        return male;
    }


    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }


    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }
}
