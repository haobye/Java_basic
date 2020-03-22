package item06OverrideSuper;
/*
设计原则：
    对于已经投入使用的类，尽量不要进行修改。
    推荐定义一个新的类，来继承利用其中的共性内容，并且添加改动新内容。
 */
public class demo01UsePhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("============");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();

    }
}
