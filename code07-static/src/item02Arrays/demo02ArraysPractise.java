package item02Arrays;

import java.util.Arrays;

//将一个随机字符串中的所有字符升序排列，并倒序打印
public class demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "asdfghjkqwertyuiopzxcvbnm";
        //使用toCharArray将字符串转换为数组，数组才能使用sort进行排序
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);

        for (int i = chars.length-1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
