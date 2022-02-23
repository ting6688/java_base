package demo;

import javax.print.DocFlavor;

public class StringDemo {

    public static void main(String[] args) {
        String str = "hello,abc";

        // 构造函数
        String helloStr = new String("hello");

        // 字符数组构建字符串
        char[] charArr =  {'c','2','y'};
        String charStr = new String(charArr);
        // charStr:c2y
        System.out.println("charStr:"+ charStr);

        // 字节数组
        byte[] byteArr = {97,98,99,100};
        String byteStr = new String(byteArr,0,2);
        // byteStr:abcd 一个字节对应一个ascii 码
        System.out.println("byteStr:"+byteStr);

    }
}
