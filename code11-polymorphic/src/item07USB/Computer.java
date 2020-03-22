package item07USB;

public class Computer {

    public static void powerOn() {
        System.out.println("打开笔记本电脑");
    }

    public static void powerOff() {
        System.out.println("关闭笔记本电脑");
    }

    public void usbDevice(USB usb) {
        usb.open();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.input();
        }
        usb.close();
    }

}
