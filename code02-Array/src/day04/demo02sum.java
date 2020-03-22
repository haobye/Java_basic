package day04;

public class demo02sum {
    public static void main(String[] args) {
        System.out.println("从一加到一百的结果是" + getSum());
    }
    public static int getSum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
