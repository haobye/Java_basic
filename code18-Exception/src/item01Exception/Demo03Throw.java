package item01Exception;
/*
throw关键字
作用:
    可以使用throw关键字在指定的方法中抛出指定的异常
使用格式:
    throw new xxxException("异常产生的原因");

注意:
    1.throw关键字必须写在方法的内部
    2.throw关键字后边new的对象必须是Exception或者Exception的子类对象
    3.throw关键字抛出指定的异常对象,我们就必须处理这个异常对象
        throw关键字后边创建的是RuntimeException或者是 RuntimeException的子类对象,我们可以不处理,默认交给JVM处理(打印异常对象,中断程序)
        throw关键字后边创建的是编译异常(写代码的时候报错),我们就必须处理这个异常,要么throws,要么try...catch
 */
public class Demo03Throw {

    public static void main(String[] args) {
//        int[] array = {};
        int[] array = {1, 2, 3};
        int result = getElement(array, 5);
        System.out.println(result);
    }

    /*
    以后我们首先要对对方传过来的参数进行合法性检验，如果参数不合法，则使用throw报错告知调用者
    注意:
            ArrayIndexOutOfBoundsException，NullPointerException是一个运行期异常,我们不用处理,默认交给JVM处理
     */
    public static int getElement(int[] array, int index) {
        if(array == null){
            throw new NullPointerException("传递的数组的值是null");
        }

        if(index<0 || index>array.length){
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }

        int result = array[index];
        return result;
    }

}
