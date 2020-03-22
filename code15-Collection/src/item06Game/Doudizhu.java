package item06Game;

import java.util.ArrayList;
import java.util.Collections;

/*
斗地主综合案例
 */
public class Doudizhu {
    public static void main(String[] args) {
        //1.准备牌
        //创建存放所有牌的列表
        ArrayList<String> poker = new ArrayList<>();
        //创建存放花色、数字的列表
        String[] colors = {"♠", "♥", "♦", "♣"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //将大王小王放入列表中
        poker.add("大王");
        poker.add("小王");
        //组装牌并放入列表中
        for(String color : colors){
            for(String number : numbers) {
                String page = color + number;
                poker.add(page);
            }
        }

        //2.洗牌
        Collections.shuffle(poker);

        //3.发牌
        //创建四个列表用于分别存储牌
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();   //三张底牌
        //先判断放入底牌，否则牌就发没啦
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p = poker.get(i);
            if (i >= 51) {
                diPai.add(p);
            }else if (i % 3 == 0) {
                play1.add(p);
            }else if (i % 3 == 1) {
                play2.add(p);
            }else if (i % 3 == 2) {
                play3.add(p);
            }
        }

        //4.看牌
        System.out.println("韩："+play1);
        System.out.println("佟："+play2);
        System.out.println("魏："+play3);
        System.out.println("底牌："+diPai);
    }
}
