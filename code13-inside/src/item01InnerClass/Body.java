package item01InnerClass;

public class Body {      //外部类

    public class Heart {     //内部类

        //内部类的方法
        public void beat() {
            System.out.println("心脏咚咚咚");
            System.out.println("my name is " + name);   //正确写法
        }

    }

    //外部的成员变量
    private String name = "凡平";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //外部类的方法
    public void methodBody() {
        System.out.println("外部类的方法");
        //用于调用内部类
        new Heart().beat();
    }

}
