package 正则表达式;

import java.util.Scanner;

public class maintest {
    public static void main(String[] args) {
        //能够用来校验字符串是否满足一定的规则，并用来校验数据格式的合法性
        //eg:检验qq账号是否合理：要求由6-20位数字构成并且首位不能为0
        String qq;
        Scanner sc=new Scanner(System.in);
        qq=sc.next();
        System.out.println(checkQQ(qq));
        //而使用正则表达式就一排代码
        boolean re=qq.matches("[1-9]\\d{5,19}");
        System.out.println(re);
    }
    //一般的方法，使用方法进行判断
    public static boolean checkQQ(String qq){
        if(qq.length()<6 || qq.length()>20)
            return false;
        if(qq.charAt(0)=='0')
            return false;
        for (int i = 0; i < qq.length(); i++) {
            char c=qq.charAt(i);
            if(c<'0' || c>'9')
                return false;
        }
        return true;
    }
}
