package demo;

import java.util.Arrays;

public class StringDemo3 {
    public static void main(String[] args) {
        String str3 = "helloaworld!!";
        // indexOf 从左往右，第一次出现的位置
        int index = str3.indexOf("l",4);
        // 97-a 输出：5
        System.out.println("index:" + index);

        int index2 = str3.lastIndexOf("l");
        // 从右往左，第一次出现的位置
        System.out.println("index2:"+index2);

        String str4 = " ";
        // 只有length=0的时候为true
        System.out.println("str4是否为空："+ str4.isEmpty());

        String str5 = "abcwwwdef";
        String www = str5.replace("www","123");
        System.out.println("www:" + www);

        // split 分割字符数组 注意点： 分隔符放在首位、中间起作用，放在末尾不起作用
        String str6 = "==www==woow====123==";
        String[] split = str6.split("==");
        // ==www==woow==123 分割得到的数组：[, www, woow, 123]
        // ==www==woow==123== 分割得到的数组：[, www, woow, 123]
        // ==www==woow====123== 分割得到的数组：[, www, woow, , 123]
        System.out.println("分割得到的数组："+ Arrays.toString(split));

        String str7 = "aaabbb";
        String substring = str7.substring(2);
        // abbb
        System.out.println("substring:" + substring);
        // 注意：包含前面的索引，不包含后面的索引[);
        String substring2 = str7.substring(0,3);
        // aaa
        System.out.println("substring2:" + substring2);

        System.out.println("转大写：" + str7.toUpperCase());
        System.out.println("转小写：" + str7.toLowerCase());

        //  去掉字符串前后的空格，不会删除中间的空格
        String str8 = "he llo ";
        System.out.println("去掉空格的字符串长度：" + str8.trim().length());
        System.out.println("原来的字符串长度："+ str8.length());


    }
}
