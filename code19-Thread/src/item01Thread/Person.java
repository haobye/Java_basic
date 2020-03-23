package item01Thread;

public class Person {
    private String name;

    //自定义一个run方法
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name+"-->"+i);
        }
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
