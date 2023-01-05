package interview;

import java.time.LocalDateTime;

//Print current date and time in Java 8 Date and Time API?
public class PrintCurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
    }
}
