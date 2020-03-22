package item04Case;

import java.util.ArrayList;

public class MainDemo {

    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=========");

        //群主发了二十元的红包，分为了三个
        ArrayList<Integer> list = manager.send(20,3);
        one.revise(list);
        two.revise(list);
        three.revise(list);

        manager.show();
        one.show();
        two.show();
        three.show();


    }

}
