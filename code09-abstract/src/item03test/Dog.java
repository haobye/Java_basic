package item03test;
//抽象子类
public abstract class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("够吃骨头");
    }

    //public abstract void sleep();
    //抽象方法所在的类必须是抽象类
}
