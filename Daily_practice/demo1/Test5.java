/*
 * @Author: 崔鹏
 * @Date: 2023-02-18 08:03:46
 * @LastEditTime: 2023-02-18 08:03:58
 * @LastEditors: 崔鹏
 * @Description: package demo1;
 * @FilePath: \Java\code\src\demo1\Test5.java
 */

package demo1;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5{
    public static void main(String[] args) {
        //判断一个年份是闰年还是平年
        //用JDK7实现
        Calendar c  = Calendar.getInstance();
        c.set(2000, 2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);


        //JDK8实现
        LocalDate ld =  LocalDate.of(2000,3,1);
        LocalDate ld2 = ld.minusDays(1);
        System.out.println(ld2);
        //获取当月的天数
        int days = ld2.getDayOfMonth();
        System.out.println(days);
        //特定方法
        System.out.println(ld2.isLeapYear());

    }
}