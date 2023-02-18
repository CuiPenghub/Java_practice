package demo1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //计算从计算机时间原点开始到如今已经过了多少天,使用JDK7和JDK8两种方法完成.
        //JDK7方式
        String date = "1970-1-1";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(date);
        long date1Time = date1.getTime();

        long todaytime = System.currentTimeMillis();

        long time = todaytime - date1Time;
        System.out.println(time/1000/60/60/24);

        //JDK8方式
        LocalDate ld1 = LocalDate.of(1970,1,1);
        LocalDate ld2 = LocalDate.now();

        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);

    }
}
