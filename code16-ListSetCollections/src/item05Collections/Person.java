package item05Collections;

//public class Person {
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    //重写定义排序的规则
    @Override
    public int compareTo(Person o) {
        //return 0;  //其认为元素是相同的。虽然在Demo03SortPerson中不再报错，但排序后和排序前一样，无用

        //自定义排序规则
//        return this.getAge() - o.getAge();  //升序
        return o.getAge() - this.getAge();  //降序
    }
}
