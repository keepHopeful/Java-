package 正则表达式之捕获分组与非捕获分组;

public class 捕获分组中$的使用 {
    public static void main(String[] args) {
        //将字符串“我要学学编编编编编程程程程程程程程”中重复的字符全部替换成一遍------输出为“我要学编程”
        String str="我要学学编编编编编程程程程程程程程";
        String regex="(.)\\1+";
        //(.)表示任意出现的字符为第一组，\\1+表示第一组至少出现一次（首个未重复字符为一组）
        //$1中$是外部引用正则表达式的组号，$1表示外部引用第一组
        String re=str.replaceAll(regex,"$1");
        System.out.println(re);


        //正则表达式内部使用（）括起来的从左到右依次计数，每两个左括号之间就是一个组别
        //这就是捕获分组
    }
}
