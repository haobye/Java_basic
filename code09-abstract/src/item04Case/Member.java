package item04Case;

import java.util.ArrayList;
import java.util.Random;

//普通成员
public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void revise(ArrayList<Integer> list) {
        //随机获取一个编号，不能超出索引范围
        int index = new Random().nextInt(list.size());
        //根据索引，从集合中删除，并且得到红包
        int delta = list.remove(index);
        //当前成员有多少钱
        int totalMoney = super.getMoney();
        //使用加法，并且重新设置回去
        super.setMoney(totalMoney+delta);

    }

}
