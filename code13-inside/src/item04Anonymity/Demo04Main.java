package item04Anonymity;
/*
如果接口的实现类（或者是父类的子类）只需要使用唯一一次
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】


匿名内部类的定义格式：
    接口名称 对象名 = new 接口名称(){
        //覆盖重写所有抽象方法
    };

对格式“new 接口名称(){……};”进行解析：
    1、new代表创建对象的动作
    2、接口名称就是匿名内部类需要实现那个接口
    3、{……}这才是匿名内部类的内容

注意事项：
    1、匿名内部类，在【创建对象】的时候，只能使用唯一一次。
        如果希望多次创建，而且类的内容是一样的话，那么就必须使用单独定义的实现类了。
    2、匿名对象，在【调用方法】的时候，只能调用唯一一次。
        如果希望同一对象，调用多次方法，那么必须给对象起个名字。
    3、弥明内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】。
        强调：不是同一回事！！！
 */
public class Demo04Main {

    public static void main(String[] args) {
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();

       //MyInterface some = new MyInterface();  //错误写法，不是java类型


//        使用匿名内部类
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法2222 -- 这是调用的第二次，所以需要有名字");
            }
        };
        obj.method();    //输出“匿名内部类实现了方法”
        obj.method2();
        System.out.println("==============");


//        使用匿名内部类，而且省略了对象名称
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法2222");
            }
        }.method();
    }

}
