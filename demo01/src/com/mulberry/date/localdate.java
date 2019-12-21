package com.mulberry.date;

import java.time.*;

public class localdate {
    public static void main(String[] args) {
        //获取当前天数
        LocalDate localDate = LocalDate.now();
        //获取当前天的月份
       int localDate1 = LocalDate.now().getDayOfMonth();
       //获取当前时间
        LocalDateTime localDateTime = LocalDateTime.now();
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        int dayOfYear = LocalDate.now().getDayOfYear();
//        System.out.println(localDate);
//        System.out.println(localDate1);
//        System.out.println(localDateTime);
//        System.out.println(dayOfWeek);
//        System.out.println(dayOfYear);
//        LocalDateTime localDate2 = LocalDate.now().atStartOfDay();
//        System.out.println(localDate2);

        //生日
//        LocalDate localDate3 = LocalDate.of(1998,3,17);
//        MonthDay monthDay = MonthDay.of(localDate3.getMonth(),localDate3.getDayOfYear());
//        MonthDay monthDay1 = MonthDay.from(LocalDate.of(2019,3,17));
//        System.out.println(monthDay1.equals(monthDay));

        //处理不同的时间
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        ZoneId zoneId1 = ZoneId.of("GMT");
        //中国时间
        LocalDateTime localDateTime1 = LocalDateTime.now();
        //美国时间
        LocalDateTime localDateTime2 = LocalDateTime.now(zoneId1);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);

    }
}
