package day04;
/*
访问数组元素的格式：     静态初始化
    数组名称[索引值]

注意事项：
    静态也有默认值，不过系统会马上用大括号中的具体数值 替换掉默认值
 */
public class demo07use {
    public static void main(String[] args) {
        //静态初始化
        int[] name = new int[] {2,5,8};
        System.out.println(name);   //直接打印数组名称，得到的是内存地址的 哈希值。[I@71e7a66b

        int num = name[2];
        System.out.println(num);

        System.out.println(name[0]);    //和python中列表一样使用索引
    }
}
