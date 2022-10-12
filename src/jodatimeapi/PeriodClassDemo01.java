package jodatimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodClassDemo01 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1999, Month.OCTOBER,18);
        LocalDate today = LocalDate.now();

        // difference between birthdate and today
        Period p = Period.between(birthday,today);
        System.out.printf("Your age is %d Years %d Months and %d Days",p.getYears(),p.getMonths(),p.getDays());

        LocalDate deathday = LocalDate.of(1999+70,Month.OCTOBER,18);
        Period d = Period.between(birthday,deathday);

        int days = d.getYears()*365 + d.getMonths()*30 + d.getDays();
        System.out.printf("\nYou will be on the earth only %d  Days!! Hurry up to do more important things.",days);

    }
}
