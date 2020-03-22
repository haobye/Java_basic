package item04Case;

import java.util.ArrayList;

//群主
public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        //创建一个集合，用来存储若干个红包的金额
        ArrayList<Integer> monList = new ArrayList<>();

        //产看群主的余额，若不够则返回提醒
        int leftMoney = super.getMoney();
        if (leftMoney < totalMoney) {
            System.out.println("对不起，您的余额不足！");
            return monList; //返回空集合
        }

        //若是余额足够，则扣钱，即重新设置余额数目
        super.setMoney(leftMoney - totalMoney);

        //平均红包
        int avg = totalMoney / count;
        int mod = totalMoney % count;  //余数，存入存入一个红包中

        //平均的金额，放入集合中
        for (int i = 0; i < count-1; i++) {
            monList.add(avg);
        }
        //最后的零头放入最后一个红包中
        int last = avg + mod;
        monList.add(last);

        //返回集合
        return monList;

    }

}
