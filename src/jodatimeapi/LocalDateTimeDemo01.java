package jodatimeapi;

import java.time.LocalDateTime;

public class LocalDateTimeDemo01 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        int dd = dt.getDayOfMonth();
        int mm = dt.getMonthValue();
        int yyyy = dt.getYear();
        int h = dt.getHour();
        int m = dt.getMinute();
        int s = dt.getSecond();
        int n = dt.getNano();

        // printing date only
        System.out.printf("%d-%d-%d",dd,mm,yyyy);

        // printing time only
        System.out.printf("\n%d:%d:%d:%d",h,m,s,n);

    }
}
