package cn.lj.demo.util;

import java.util.Calendar;

public class  TimeUtils {
    public static String getTime(){

        Calendar cal = Calendar.getInstance();

        StringBuffer sf = new StringBuffer();

        int year = cal.get(Calendar.YEAR);//获取年份

        sf.append(year);
        int month=cal.get(Calendar.MONTH);//获取月份
        if(month<10){
            sf.append(0);
        }
        sf.append(month);
        int day=cal.get(Calendar.DATE);//获取日  
        if(day<10){
            sf.append(0);
        }
        sf.append(day);
        int hour=cal.get(Calendar.HOUR_OF_DAY);//小时

        if(hour<10){
            sf.append(0);
        }
        sf.append(hour);
        int minute=cal.get(Calendar.MINUTE);//分

        if(minute<10){
            sf.append(0);
        }
        sf.append(minute);
        int second=cal.get(Calendar.SECOND);//秒

        if(second<10){
            sf.append(0);
        }
        sf.append(second);
        return sf.toString();
    }

    public  static long currentTimeMillis(){

        return System.currentTimeMillis()/1000;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
