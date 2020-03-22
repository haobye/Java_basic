package item02LocalVariable;
/*
如果一个类是定义在一个方法内部的，那么这就是一个局部内部类。
“局部”：只有当前多数的方法才能使用它，出来这个方法外面就不能用啦。

定义格式：
修饰符 class 外部类名称 {
    修饰符 返回值类型 外部类方法名称(参数列表) {
        class 局部内部类名称 {
            //……
        }
    }
}
*/
class Outer {

    public void outerMethod() {

        class Inner{
            int num = 20;
            public void InnerMethod() {
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.InnerMethod();

    }

}
