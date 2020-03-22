package item06Instanceof;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("够吃骨头");
    }

    public void watchHouse() {
        System.out.println("狗看家");
    }
}
