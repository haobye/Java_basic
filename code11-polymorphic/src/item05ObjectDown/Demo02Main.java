package item05ObjectDown;

/*
向上转型一定是安全的，没有问题的，正确的。但是也有一个弊端：
    对象一旦向上转型为父类，那么就无法调用子类原本特有的内容。

解决方案：
    用对象的向下转型【还原】。
 */
public class Demo02Main {

    public static void main(String[] args) {
        //对象的向上转型，就是：父类引用指向子类对象。
        Animal animal = new Cat();
        animal.eat();       //猫吃鱼

        //向下转型，进行还原动作
        Cat cat = (Cat) animal;
        cat.catchMouse();  //猫抓老鼠

        //这是一个错误的向下转型方法
        //本来new的是一只猫，现在非要向下转型当一只狗
//        Dog dog = (Dog) animal;
        //编译不报错，运行报错。
        //java.lang.ClassCastException，类转换异常。
    }

}
