package day07;
/*
this关键字

当方法的局部变量和类的成员变量重名时，根据就近原则，优先使用局部变量
如果需要访问本类当中的成员变量，需要使用格式：this.成员变量名

“通过谁调用的方法，谁就是this”，
本例子中Person就是this
 */
public class Person {

    String name;
    /*public void say(String who) {
        System.out.println(who + "，你好。我是" + name);
    }*/
    public void say(String name) {
        System.out.println(name + "，你好。我是" + this.name);
        //不使用this关键词，将输出“王思聪，你好。我是王思聪”
        //在成员变量前加this
    }
}
