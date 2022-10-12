package jodatimeapi;

import java.time.LocalTime;

public class LocalTimeDemo01 {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);
        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();

        // custom time format
        System.out.printf("%d:%d:%d:%d",h,m,s,n);

    }
}
