package jodatimeapi;

import java.time.Year;
import java.util.Scanner;

public class YearClassDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year Number: ");
        int n = sc.nextInt();
        Year y = Year.of(n);

        // check given year is leap year or not
        if (y.isLeap()){
            System.out.printf("%d Year is Leap Year",n);
        }else{
            System.out.printf("%d Year is Not Leap Year",n);
        }
    }
}
