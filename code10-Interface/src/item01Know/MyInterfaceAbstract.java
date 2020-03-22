package item01Know;
/*
任何版本的Java中，接口都能定义抽象方法。
格式：
     public abstract 返回值类型 方法名称(参数列表);

注意事项：
    1、接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract。
    2、这两个关键字修饰符，可以选择性的省略。(今日新学，所以不推荐)。
    3、方法的三要素，可以随意定义。
 */
public interface MyInterfaceAbstract {
    //以下四种都是抽象方法
    public abstract void methodA();

    abstract void methodB();

    public void methodC();

    void methodD();

}
