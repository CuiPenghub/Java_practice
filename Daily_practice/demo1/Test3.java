package demo1;

public class Test3 {
    public static void main(String[] args) {
        //自己定义方法实现toBinaryString方法效果，将十进制整数转变为自负床表示的二进制数。
        System.out.println(toBinaryString(234));

        System.out.println(Integer.toBinaryString(234));
    }

    public static String toBinaryString(int number){
        //定义一个Stringbuilder类去拼接余数
        StringBuilder sb = new StringBuilder();
        //利用循环不断除二
        while (true){
            if(number ==0){
                break;
            }
            //获取余数
            int remainder = number % 2;
//            System.out.println(remainder);
            //将数据除2
            number = number/2;

            sb.insert(0, remainder);
        }

        return sb.toString();
    }
}
