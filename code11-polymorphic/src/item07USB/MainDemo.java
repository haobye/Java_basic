package item07USB;

public class MainDemo {

    public static void main(String[] args) {
        //创建一个对象
        Computer computer = new Computer();
        computer.powerOn();

        /*//第一种方案：(以鼠标为例)
        //创建一个鼠标，供电脑使用
        Mouse mouse = new Mouse();
        //向上转型
        USB usbMouse = mouse;*/
        //合二为一的写法：
        USB usbMouse = new Mouse();     //多态写法
        computer.usbDevice(usbMouse);

        //第二种方案：(以键盘为例)
        //创建一个键盘
        Keyboard keyboard = new Keyboard();
        computer.usbDevice(keyboard);   //没有使用多态写法
        //合二为一的写法：
//        computer.usbDevice(new Keyboard());  //也是正确写法

        computer.powerOff();

        System.out.println("=======");
        method(10.0);//double --> double，正确
        method(20);//int --> double，正确
        int count = 30;
        method(count);//int --> double，正确
    }

    public static void method(double num) {
        System.out.println(num);
    }

}
