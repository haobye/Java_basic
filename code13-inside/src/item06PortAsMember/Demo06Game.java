package item06PortAsMember;
/*
day11_16_接口作为成员变量类型
 */
public class Demo06Game {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setName("艾希");

        //1、使用单独定义的实现类
//        hero.setSkill(new SkillImpl());
//        hero.attack();

        //2、使用匿名函数
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia~~pia~~pia~~");
//            }
//        };
//        hero.setSkill(skill);
//        hero.attack();

        //3、简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Bui~~pia~~bui~~pia~~");
            }
        });
        hero.attack();

    }

}
