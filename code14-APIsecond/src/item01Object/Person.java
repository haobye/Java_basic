package item01Object;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    /*重写toString方法*/
    /*@Override
    public String toString() {
        *//*return "abc";*//*
        return "person:name="+name+",age="+age;
    }*/

    /*可以使用快捷键 Alt+insert 重写toString方法*/
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }


    /*
    Object类的equals方法，默认比较的是两个对象的地址值，没有意义。
    所以我们要重写equals方法，比较两个对象(name和age)的属性。
    问题：隐藏一个多态
        多态的弊端：无法使用子类特有的内容(属性和方法)
        Object obj =  p2 = new Person("小红", 17);
            解决方法：可以使用向下转型(强转)把Obj类型转换为Person
     */
    /*@Override
    public boolean equals(Object obj) {
        //增加一个判断，传递的参数obj如果是this本身，则直接返回true，可提高代码效率
        if (obj == this) {
            return true;
        }
        //增加一个判断，传递的参数obj如果是空null，则直接返回false，可提高代码效率
        if (obj == null) {
            return false;
        }
        //增加一个判断，防止类型转换异常ClassCastException---(解决ArrayList的那个异常)
        if (obj instanceof Person) {
            //向下转型
            Person p = (Person)obj;
            //比较两个对象的属性,this(p1)和p(obj->p2)
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        //不是Person类型，则返回false---(解决ArrayList的那个异常)
        return false;
    }*/

    //也可以使用快捷键来重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //getClass() != o.getClass() 使用反射技术判断o是否是Person类型， 等效于 if (obj instanceof Person) {}
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);   //防止空指针异常
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
