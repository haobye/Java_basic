package item06OverrideSuper;
/*
创建一个新手机，继承老手机的方法，并且新增功能
 */
public class NewPhone extends Phone {

    @Override
    public void show() {
//        System.out.println("显示号码");

        //代码不完美，“显示号码”的代码在老手机中已经实现过了
        //使用super将老手机中的show方法拿来
        super.show();

        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
