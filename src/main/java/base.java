import org.omg.PortableInterceptor.INACTIVE;

public class base {


    public static void main(String[] args) {

        // 装箱
        Integer i = new Integer(4);
        Integer i2 = Integer.valueOf(56);

        // 拆箱
        int num = i2.intValue();
        System.out.println("num:"+num);
        System.out.println("--------------");

        // jdk 1.5 自动装箱拆箱
        Integer integer1 = 5; // 自动装箱
        int result  = integer1 +1 ; // 自动拆箱
        System.out.println("result:"+result);

        System.out.println("=================");
        // 基本类型与字符串之间的转换
        // 基本类型--->字符串
        int a = 34;
        String aStr = a + "";
        // 字符串 ---> 基本数据类型
        // "34" ---> 34
        int aNum = Integer.parseInt(aStr);
        System.out.println("aNum:"+aNum);


    }
}
