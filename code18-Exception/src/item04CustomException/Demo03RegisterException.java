package item04CustomException;

import java.util.Scanner;

public class Demo03RegisterException {

    static String[] names = {"lisa", "john", "jerry"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your username:");
        String username = sc.next();
        compareName(username);
    }

    private static void compareName(String username) {
        for (String each : names) {
            if (each.equals(username)) {
                try{
                    throw new Demo01Exception("亲，你输入的用户名已经被注册");
                }catch(Exception e){
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("恭喜您，用户名注册成功");
    }

}
