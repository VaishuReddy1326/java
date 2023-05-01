import java.time.LocalDate;
import java.time.Instant;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DatesExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime ramajoiningdate = LocalDateTime.of(2022 , 11 , 13 , 18 , 45 , 59);
        System.out.println(ramajoiningdate);
        LocalDateTime sitajoiningdate = LocalDateTime.of(2021 , 9 , 26 , 23 , 56 , 23);
        System.out.println(sitajoiningdate);
        var res1 = ramajoiningdate.isAfter(sitajoiningdate);
        System.out.println(res1);
        var res2 = ramajoiningdate.isBefore(sitajoiningdate);
        System.out.println(res2);
        var res3 = ramajoiningdate.isEqual(sitajoiningdate);
        System.out.println(res3);
        var res4 = ramajoiningdate.compareTo(sitajoiningdate);
        System.out.println("res4");
        var Zone = LocalDateTime.now(ZoneId.systemDefault());
        System.out.println(Zone);
        for(String zone : ZoneId.getAvailableZoneIds());
             System.out.println(Zone);
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/kolkata")));
        System.out.println(ZonedDateTime.now());
        System.out.println(LocalDateTime.now().getYear());
        System.out.println(LocalDateTime.now().getDayOfYear());
        System.out.println(LocalDateTime.now().getDayOfMonth());
        System.out.println(LocalDateTime.now().getHour());
        System.out.println(LocalDateTime.now().getMinute());
        System.out.println(LocalDateTime.now().getSecond());




    }
    
}
