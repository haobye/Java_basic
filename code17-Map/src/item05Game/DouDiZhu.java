package item05Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//斗地主综合案例:有序版本
public class DouDiZhu {

    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        List<String> colors = List.of("♠", "♥", "♦", "♣");
        List<String> numbers = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");

        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        for (String color : colors) {
            for (String number : numbers) {
                String card = color + number;
                poker.put(index, card);
                pokerIndex.add(index);
                index++;
            }
        }
        //System.out.println(poker);
        //System.out.println(pokerIndex);

        Collections.shuffle(pokerIndex);

        ArrayList<Integer> diPai = new ArrayList<>();
        ArrayList<Integer> play01 = new ArrayList<>();
        ArrayList<Integer> play02 = new ArrayList<>();
        ArrayList<Integer> play03 = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer num = pokerIndex.get(i);
            //先判断底牌
            if (i>=51) {
                diPai.add(num);
            } else if (i % 3 == 0) {
                play01.add(num);
            } else if (i % 3 == 1) {
                play02.add(num);
            } else if (i % 3 == 2) {
                play03.add(num);
            }
        }

        Collections.sort(diPai);
        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);

        lookPoker("底牌", poker, diPai);
        lookPoker("周星驰", poker, play01);
        lookPoker("刘德华", poker, play02);
        lookPoker("周润发", poker, play03);
    }


    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        System.out.print(name+":");
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }

}
