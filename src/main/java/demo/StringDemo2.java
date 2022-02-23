package demo;

import java.util.Arrays;

public class StringDemo2 {

    public static void main(String[] args) {
        String str = "abcd123456";
        char c = str.charAt(2);
        // index: 0---> length()-1
        System.out.println("c:"+c);

        // concat() 拼接函数
//        String newString = str + "---->";
        // abcd123456---->
        String newString = str.concat("---->");
        System.out.println("newStr:" + newString);
        // contains() 包含函数
        boolean conFlag = str.contains("ab");
        System.out.println("conFlag:"+ conFlag);

        // endsWith() startswith()
        String txtStr = "hello.txt";
        boolean endsWith = txtStr.endsWith(txtStr);
        System.out.println("endsWith:" + endsWith);

        String str1 = "2022xue.com";
        boolean startsWith = str1.startsWith(str1);
        System.out.println("startsWith:"+ startsWith);

        boolean abc = "abc".equals("abc");
        System.out.println("abc:"+abc);

        boolean aBc = "abc".equals("aBc");
        System.out.println("aBc:"+aBc);
        boolean aBC = "abc".equalsIgnoreCase("aBC");
        System.out.println("aBc:"+aBC);
        // string-->byte[]
        String str2 = "abc";
        char[] chars = str2.toCharArray();
        // chars:[a, b, c]
        System.out.println("chars:"+ Arrays.toString(chars));

    }
}
