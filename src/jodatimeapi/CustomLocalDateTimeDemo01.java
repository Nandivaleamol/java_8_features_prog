package jodatimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class CustomLocalDateTimeDemo01 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(1999, Month.OCTOBER,18,06,45,18);
        System.out.println(dt);

        // methods..
        System.out.println("After Six Months date: "+dt.plusMonths(6));
        System.out.println("Before Six Months date : "+dt.minusMonths(6));

        // birth date
        LocalDate dob = LocalDate.of(1999,10,18);
        System.out.println("Date of Birth : "+dob);
    }
}
