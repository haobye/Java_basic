package item01Exception;

import java.util.Objects;

/*
Objects类中的静态方法          【【Objects.requireNonNull(obj, "空的");】】

public static <T> T requireNonNull(T obj):查看指定引用对象不是null。
源码:
    public static <T> T requireNonNull(T obj) {
        if (obj == null)
            throw new NullPointerException();
        return obj;
    }
 */
public class Demo04Objects {

    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object obj) {
        //对传递过来的参数进行合法性检验，判断是否为空
        /*if(obj == null){
            throw new NullPointerException("传递参数为空");
        }*/
        //简化写法
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "是空的");
    }

}
