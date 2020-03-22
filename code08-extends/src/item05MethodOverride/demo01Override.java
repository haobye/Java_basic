package item05MethodOverride;
/*
方法覆盖重写的注意事项：

    1、必须保证父子类之间的方法名相同，参数列表也相同。
        @Override：写在方法前面，用来检测方法的覆盖是否错误。
                  （可选，写不写都可以，只用于检测）

    2、子类方法的返回值必须【小于等于】父类方法的返回值范围。
        前提：java.lang.Object类是所有类的公共最高父类(祖宗类)，
             java.lang.String就是Object的子类。

    3、子类方法的权限必须【大于等于】父类方法的权限修饰符。
        小扩展：public > protected > (default) > private
        备注：(default)不是关键字default，而是什么都不写，留空。
 */
public class demo01Override {
}
