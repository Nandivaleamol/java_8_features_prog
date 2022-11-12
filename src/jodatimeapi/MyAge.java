package jodatimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class MyAge {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate dob = LocalDate.of(1999,Month.OCTOBER,18);

        Period p = Period.between(dob,currentDate);
        System.out.println(p);
    }
}
