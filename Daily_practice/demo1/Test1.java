package demo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入1-100之间的整数，添加到集合中。直到集合中的所有数据和超过200为止。
        //创建一个集合用来接收整数
        ArrayList<Integer> list = new ArrayList<>();
        //键盘录入数据，添加到集合中。
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数:");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            //把异常数据进行过滤
            if(num<1 || num>100){
                System.out.println("Invalid number");
                continue;
            }
            //添加到集合中
            list.add(num);

            //判断集合的数据和
            int sum = getsum(list);
            if(sum>200){
                System.out.println("集合中所有的数据和已经超过200");
                break;
            }else {
                continue;
            }
        }
        //查看集合数据，验证结果
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+",");
        }

    }

    private static int getsum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            sum = sum + num;
        }
        return sum;
    }


}
