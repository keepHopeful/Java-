package Split;

public class miantest {
    public static void main(String[] args) {
        //1.以单个字符作为分隔符---对字符串进行操作
        String str="abcd,dfsdfb,fdfgev";
        String[] words=str.split(",");
        for(String s:words){
            System.out.println(s);
        }//作为加强foreach循环，words是要遍历的数组，s是创建的临时变量作为每一次的接收


        //2.以多个字符作为分隔符
        String str2="safd dssvfbs,sgwsb,sdgrbw";
        String[] str3=str2.split(" |\\,");        //使用|来指定多个分隔符
        for(String p:str3){
            System.out.println(p);
        }


        //3.使用正则表达式作为分隔符
    }
}
