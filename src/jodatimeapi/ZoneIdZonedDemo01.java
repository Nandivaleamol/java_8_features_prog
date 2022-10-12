package jodatimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdZonedDemo01 {
    public static void main(String[] args) {

        // current zone
        ZoneId id = ZoneId.systemDefault();
        System.out.println(id);

        // other zone time
        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zdt = ZonedDateTime.now(la);
        System.out.println(zdt);
    }
}
