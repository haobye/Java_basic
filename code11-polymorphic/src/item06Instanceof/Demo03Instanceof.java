package item06Instanceof;
/*

 */
public class Demo03Instanceof {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();       //猫吃鱼

        //如果希望使用子类特有方法，需要向下转型
        //判断一下父类引用animal本来是不是Dog类
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        //判断animal本来是不是Cat类
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }

}
