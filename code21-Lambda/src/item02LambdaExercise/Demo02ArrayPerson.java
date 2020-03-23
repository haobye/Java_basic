package item02LambdaExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
练习二：
    Lambda表达式【有参数、无返回值】的练习
    使用数组存储多个Person对象
    对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 */
public class Demo02ArrayPerson {
    public static void main(String[] args) {
        //1、使用数组存储多个Person对象
        Person[] arr = {
                new Person("迪丽热巴", 20),
                new Person("赵丽颖", 26),
                new Person("林允儿", 19)
        };

        //2、使用Arrays的sort方法进行排序，(前面减后面--升序)
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();     //根据年龄排序
            }
        });*/

        //2、使用Lambda简化代码
//        Arrays.sort(arr, (Person o1, Person o2)->{
//            return o1.getAge()-o2.getAge();
//        });

        //2、优化省略Lambda，注意【大括号没有】
        Arrays.sort(arr, (o1, o2)->o1.getAge()-o2.getAge());

        //3、遍历数组，输出查看
        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
