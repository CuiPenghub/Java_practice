package demo1;

public class Test2 {
    public static void main(String[] args) {
        //用个人方法实现parseInt效果，0不开头，只输入数字,最少一位最多10位。
        //定义一个字符串
        String str ="123456789";

        //校验字符串
        if(!str.matches("[1-9]\\d{0,9}")){
            //异常数据
            System.out.println("数据格式有误");
        }else {
            //正确数据
            System.out.println("数据格式正确");
            //定义变量表示最终结果
            int num = 0;
            //遍历字符串得到里面的每一个字符
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                num = num * 10 + c;

            }
            System.out.println("转换后的parseInt数值为:"+ num);
        }

    }
}
