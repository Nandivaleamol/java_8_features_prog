package jodatimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateDemo01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // partition date
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();

        // custom formatting
        System.out.printf("%d-%d-%d",dd,mm,yyyy);
    }
}
