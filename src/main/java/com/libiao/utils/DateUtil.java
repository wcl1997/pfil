package com.libiao.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateUtil {
    //获取系统当前时间
    public static String currentLocalDataTime(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd: HH:mm:ss SSS"));
    }
/*    public static void main(String[] args) {
        System.out.println(firstDayOfMonth("20190911"));
    }*/
}
