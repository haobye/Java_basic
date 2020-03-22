package item07PortAsParamOrReturn;

import java.util.ArrayList;
import java.util.List;

/*
day11_17_接口作为方法的参数和返回值。
按住 Alt + 回车键 可以导入模块
 */
public class Demo07Interface {

    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态写法
        //注意不是ArrayList，而是List
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }

    //用接口做返回值
    public static List<String> addNames(List<String> list) {
        list.add("地理热轧");
        list.add("牛扎糖");
        list.add("马儿扎哈");
        list.add("撒亚那拉");
        return list;
    }

}
