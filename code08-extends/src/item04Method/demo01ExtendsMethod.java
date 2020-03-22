package item04Method;
/*
在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
        创建对象是谁，就优先用谁，如果没有则向上找。

注意事项：
    无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类（不知道子类是谁）


重写又叫【覆盖，覆写】
概念：在继承关系中，方法的名称一样，参数列表也一样。

重写（override）：方法的名称一样，参数列表【也一样】。
重载（overload）：方法的名称一样，参数列表【不一样】。

方法的覆盖重写的特点：
    创建的是子类对象，则优先用子类方法。
 */
public class demo01ExtendsMethod {
    public static void main(String[] args) {
        //子类继承了父类
        Zi zi = new Zi();
        zi.MethodZi();
        zi.MethodFu();

        //重名的
        zi.Method();
    }
}
