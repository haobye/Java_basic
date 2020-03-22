package item05ClassAsMember;
/*
day11_15_类作为成员变量类型
 */
public class Demo05Main {

    public static void main(String[] args) {
        Hero hero = new Hero();
        //创建一个英雄，起名、年龄
        hero.setName("爱伦");
        hero.setAge(20);

        Weapon weapon = new Weapon("‘好剑’");
        //创建一个武器，给英雄
        hero.setWeapon(weapon);

        hero.attack();   //其实只是一个组合输出的方法
    }

}
