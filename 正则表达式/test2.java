package 正则表达式;

public class test2 {
    public static void main(String[] args) {
        String phonenumber="14375574657";
        String regex1="1[3-9]\\d{9}";
        //第一个1也可以写成[1]，表示第一个数字只能是1，[3-9]表示第二个数字的范围是3-9，\\d表示后面的都必须是数字，而{9}，表示要有9个
        boolean re1=phonenumber.matches(regex1);
        System.out.println(re1);

        //验证座机号码------eg:020-2324242
        String znumber="020-2324242";
        String regex2="0\\d{2,3}-?[0-9]\\d{4,9}";
        boolean re2=znumber.matches(regex2);
        System.out.println(re2);

        //验证邮箱号码
        //eg:deliay0009@pci.com.cn              规则：@之前是任意字母或数字，@之后有三部分，1.任意字母或数字构成（2-6）位
        //2.只有一个字符"."        3.由2-3个字母构成     （并且"."+2-3个字母可以1-2次重复）
        String email="deliay0009@pci.com.cn";
        String regex3="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        //+表示\w单词字符可以出现一次或多次          [\\w&&[^_]]{2,6}表示@之后的内容位2-6位数字或者字母
        //[\\.[a-zA-Z]{2,3}]{1,2}   表示.xxx（其中x表示任意一个字母）可以出现1-2次
        boolean re3=email.matches(regex3);
        System.out.println(re3);

        //验证用户名大小写字母或_共4-16位
        String user="afdfsda_efa34";
        String regex4="\\w{4,16}";
        boolean re=user.matches(regex4);
        System.out.println(re);

        //验证身份证：前17位是数字，最后一位是大写或小写的x
        String card="511302200502165718";
        String regex5="\\d{17}(\\d|X|x)";     //等价于"\\d{17}[\\dXx]"或"\\d{17}[\\d(?i)x]"
        boolean re6=card.matches(regex5);
        String regex6="\\d{17}[\\d(?i)x]";                //(?i)忽略这个符号之后所有字母的大小写   a((?i)b)c  则是只忽略b的大小写
        boolean re7=card.matches(regex6);
        System.out.println(re6);
        System.out.println(re6);


    }
}
